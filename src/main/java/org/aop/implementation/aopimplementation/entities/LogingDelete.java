package org.aop.implementation.aopimplementation.entities;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LogingDelete {

    public String User(){
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            return userDetails.getUsername();
        }
        catch (NullPointerException n){

            return "";
        }
    }

    @After("@annotation(org.aop.implementation.aopimplementation.entities.Controlled) && execution(* org.aop.implementation.aopimplementation.entities.*Repository.delete(..)) ")
    public void deleteEntity(JoinPoint joinPoint){
        System.out.println("delete+++++++++");

        Object o=joinPoint.getArgs()[0];

        if(o instanceof Personne){

            System.out.println("personne deletted +::"+((Personne) o).toString()   +"  by   "+this.User());
        }


    }


    @After("@annotation(org.aop.implementation.aopimplementation.entities.Controlled) && execution(* org.aop.implementation.aopimplementation.entities.*Repository.save(..)) ")
    public void SaveEntity(JoinPoint joinPoint){
        System.out.println("Save+++++++++");

        Object o=joinPoint.getArgs()[0];

        if(o instanceof Personne){

            System.out.println("personne saved +::"+((Personne) o).toString()   +"  by   "+this.User());
        }


    }

}
