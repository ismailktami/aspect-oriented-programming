package org.aop.implementation.aopimplementation.entities;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.awt.*;

@Aspect
@Component
public class Logging4 {
    @Around("Allmethods()")
    public void findOne(ProceedingJoinPoint proceedingJoinPoint){
        System.err.println("logging 4");
        try {
            System.out.println("before find");
            proceedingJoinPoint.proceed();
            System.out.println("after find");
        }
        catch (Throwable t){
            System.out.println("After throwing");
        }
    }


    @Pointcut("execution(*  org.aop.implementation.aopimplementation.entities.PersonneRepository.save(..))")
    public void Allmethods(){

    }

}
