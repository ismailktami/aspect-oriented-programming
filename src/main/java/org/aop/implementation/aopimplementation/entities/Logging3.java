package org.aop.implementation.aopimplementation.entities;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging3 {
    @Before("execution(* org.aop.implementation.aopimplementation.entities.PersonneRepository.save(..))")
    public void getTarget(JoinPoint joinPoint){
        System.out.println(joinPoint.getTarget());
    }

    //@Before("args(id)")
    public void callArgument(Long id ){
        System.out.println("Personne argument is called" + id);
    }

}
