package org.example.repository;

import org.example.dto.BookDto;
import org.example.entity.Book;
import org.example.entity.BookEntity;
import org.example.spi.port.BookRepository;
import org.example.util.HibernateSession;
import org.hibernate.Session;

import java.util.List;

public class BookRepositoryImpl implements BookRepository {

    private BookEntityRepository bookEntityRepository;

    public BookRepositoryImpl (){
        bookEntityRepository = new BookEntityRepository();
    }

    @Override
    public boolean create(Book book) {
        Session session = HibernateSession.getSessionFactory().openSession();
        bookEntityRepository.setSession(session);
        session.beginTransaction();
        try{
            BookEntity bookEntity = BookEntity.builder()
                    .title(book.getTitle())
                    .author(book.getAuthor())
                    .isAvailable(book.isAvailable())
                    .build();
            bookEntityRepository.create(bookEntity);
            book.setId(bookEntity.getId());
            return true;
        }catch (Exception ex) {
            return false;
        }
    }



    @Override
    public boolean delete(Book book) {
        Session session = HibernateSession.getSessionFactory().openSession();
        session.beginTransaction();
        try (session){
            bookEntityRepository.setSession(session);
            BookEntity bookEntity = bookEntityRepository.findById(book.getId());
            bookEntityRepository.delete(bookEntity);
            session.getTransaction().commit();
            return true;
        }catch (Exception ex) {
            session.getTransaction().rollback();
            throw ex;
        }
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public Book findById(Long id) {
        Session session = HibernateSession.getSessionFactory().openSession();
        try (session) {
            bookEntityRepository.setSession(session);
            BookEntity bookEntity = bookEntityRepository.findById(id);
            Book book = new Book(bookEntity.getId(), bookEntity.getTitle(), bookEntity.getAuthor(), bookEntity.isAvailable());
            return book;
        }catch (Exception ex) {
            throw ex;
        }

    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
