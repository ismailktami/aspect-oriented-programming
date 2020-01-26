package org.aop.implementation.aopimplementation.entities;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.security.Principal;

@Aspect
@Component
public class Logging {

       @Before("execution( * org.aop.implementation.aopimplementation.entities.PersonneRepository.findById(..))")
        public void findAll() {
           try {
               Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
               UserDetails userDetails = (UserDetails) authentication.getPrincipal();
               System.err.println("find by id  personne by !! " + userDetails.getUsername());
           }
           catch (NullPointerException n){
               new RuntimeException("not connected");
           }
       }
        @Before("execution(*  org.aop.implementation.aopimplementation.entities.PersonneRepository.save(..))")
        public void insertion(){
            System.err.println("insertion personne");
        }









}
