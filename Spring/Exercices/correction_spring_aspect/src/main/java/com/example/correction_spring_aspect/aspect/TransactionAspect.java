package com.example.correction_spring_aspect.aspect;

import com.example.correction_spring_aspect.entity.Author;
import com.example.correction_spring_aspect.entity.Book;
import com.example.correction_spring_aspect.repository.AuthorRepository;
import com.example.correction_spring_aspect.repository.BookRepository;
import com.example.correction_spring_aspect.service.AuthorService;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TransactionAspect {

    private Session session;
    private SessionFactory sessionFactory;
    private static BookRepository bookRepository;
    private static AuthorRepository authorRepository;

    public TransactionAspect(SessionFactory sessionFactory){
        sessionFactory = sessionFactory;
    }

    @Pointcut("@annotation(com.example.correction_spring_aspect.annotation.Transaction)")
    public void logPointCut() {
    }

    @Around("logPointCut()")
    public Object TransactionAspect(ProceedingJoinPoint joinPoint) throws Throwable {

        session = sessionFactory.openSession();
        session.beginTransaction();


        Book book = new Book().setAuthor();

        Object object = joinPoint.proceed();
        try{
            bookRepository.save(book);
            session.getTransaction().commit();
            result = true;
        }catch (Exception e){
            try{
                session.getTransaction().rollback();
            }catch (Exception except){
                System.out.println(except.getMessage());
            }
        }finally {
            session.close();
        }
        return object;
    }


}
