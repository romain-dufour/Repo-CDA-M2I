package com.example.exercice1_spring_aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

@Component
@Aspect
public class PerformanceAspect {

    @Around("execution(* com.example.exercice1_spring_aop.service.*.*(..)))")
    public void ExecutionTimePerformance(ProceedingJoinPoint joinPoint) {
        long startTime = System.currentTimeMillis();
        try {
            Object[] args = joinPoint.getArgs();
            System.out.println("Temps d'execution : " + System.currentTimeMillis());
            joinPoint.proceed();
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Temps d'execution : " + executionTime + " millisecondes");
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
