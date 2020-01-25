package org.aop.implementation.aopimplementation.entities;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Aspect
@Component
public class Logging3 {
    @Before("execution(* org.aop.implementation.aopimplementation.entities.PersonneRepository.save(..))")
    public void getTarget(JoinPoint joinPoint){
        System.out.println(joinPoint.getTarget());
    }

    @Before(" execution(* org.aop.implementation.aopimplementation.entities.PersonneRepository.findById(..)) && args(id)")
    public void callArgument(Long id ){
        System.out.println("Personne argument is called" + id);
    }

    @AfterReturning(pointcut = "execution(* org.aop.implementation.aopimplementation.entities.PersonneRepository.findById(..)) && args(id)",returning = "personne")
    public void callArgumentAfter(Long id, Object personne){
        System.out.println("persone is "+ personne);
    }
}
