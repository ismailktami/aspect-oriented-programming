package org.aop.implementation.aopimplementation.entities;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingGetData {


    @Before("@annotation(org.aop.implementation.aopimplementation.entities.Loggable) ")
    public void getDatasStatistiques(JoinPoint joinPoint){

        System.out.println(User.getUser());
        System.out.println("find data by using :: methode = "+joinPoint.getSignature());


    }
}
