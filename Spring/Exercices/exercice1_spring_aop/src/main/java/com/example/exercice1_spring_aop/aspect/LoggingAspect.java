package com.example.exercice1_spring_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.logging.Logger;

@Component
@Aspect
public class LoggingAspect {

    @Around("execution(* com.example.exercice1_spring_aop.service.*.*(..)))")
    public Object loggedMethodAfterAndBefore(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("log : " +
                    LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
            + joinPoint.getSignature());
//            Object[] args = joinPoint.getArgs();
           Object object = joinPoint.proceed();
           return object;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }

//    private static Logger logger = (Logger) LoggerFactory.getLogger(LoggingAspect.class);
//
//
//    @Pointcut("@annotation(com.example.exercice1_spring_aop.annotation.LoggedAnnotation)")
//    public void logPointCut(){
//
//    }
//    @Around("logPointCut()")
//    public void logAspect(){
//
//    }
}
