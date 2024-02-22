package com.example.demo_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoAspect {

    //* com.example.demo_aop.service.*.*()) => la totalité des méthode des classes du package service avec 0 argument
    //* com.example.demo_aop.service.*.*(..)) => la totalité des méthode des classes du package service avec n'importe quel argument
    //* com.example.demo_aop.service.*.*(Long ou int ou ...)) => la totalité des méthode des classes du package service avec un argument ciblé
//    @Before("execution(* com.example.demo_aop.service.*.*(..))")
//    public void addActionBefore() {
//        System.out.println("Action executed by Aspect");
//    }
//
//    @After("execution(* com.example.demo_aop.service.*.*(..))")
//    public void addActionAfter() {
//        System.out.println("Action executed after by Aspect");
//    }
//
//    @AfterReturning("execution(* com.example.demo_aop.service.*.*(..))")
//    public void addActionAfterReturning() {
//        System.out.println("Action executed after returning value by Aspect");
//    }
//
//    @AfterThrowing("execution(* com.example.demo_aop.service.*.*(..))")
//    public void addActionAfterThrowing() {
//        System.out.println("Action executed after Throwing exception by Aspect");
//    }


    @Around("execution(* com.example.demo_aop.service.*.*(..))")
    public void addActionAround(ProceedingJoinPoint joinPoint)  {
        try{
            //Avant
            System.out.println("Start around");
            //Execute
            //Recuperer les arguments
            Object[] args = joinPoint.getArgs();
            //utiliser les arguments de la methode
            joinPoint.proceed();
        }catch (Exception ex){
            //Après
            System.out.println("End around");

        }catch (Throwable e){
            throw new RuntimeException(e);
        }
    }

    @Pointcut("@annotation(com.example.demo_aop.annotation.CustomAnnotation)")
    public void customAnnotationPointCut() {

    }

    @Before("customAnnotationPointCut()")
    public void methodApsectWithAnnotation(){
        System.out.println("Aspect run before method with annotation");
    }


}
