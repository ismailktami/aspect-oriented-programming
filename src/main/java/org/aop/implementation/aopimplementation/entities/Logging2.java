package org.aop.implementation.aopimplementation.entities;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging2 {
    @Before("getAllfind()")
    public void findOne(){
        System.out.println("find one");
    }
    @Before("getAllfind()")
    public void findOne2(){
        System.out.println("find one 2");
    }

    @Pointcut("execution(* org.aop.implementation.aopimplementation.entities.PersonneRepository.save(..))")
    public void getAllfind(){

    }
}
