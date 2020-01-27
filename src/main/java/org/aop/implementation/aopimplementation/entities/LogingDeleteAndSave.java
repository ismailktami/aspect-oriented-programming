package org.aop.implementation.aopimplementation.entities;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class LogingDeleteAndSave {



    @After("@annotation(org.aop.implementation.aopimplementation.entities.Controlled)) ")
    public void deleteEntity(JoinPoint joinPoint){
        Object o=joinPoint.getArgs()[0];
        if(o instanceof Personne){
            System.out.println("personne deletted +::"+((Personne) o).toString()   +"  by   "+User.getUser());
        }


    }


    @After("@annotation(org.aop.implementation.aopimplementation.entities.Controlled)) ")
    public void SaveEntity(JoinPoint joinPoint){
        Object o=joinPoint.getArgs()[0];
        if(o instanceof Personne){
            System.out.println("personne saved +::"+((Personne) o).toString()   +"  by   "+User.getUser());
        }


    }

}
