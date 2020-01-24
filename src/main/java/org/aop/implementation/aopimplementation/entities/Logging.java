package org.aop.implementation.aopimplementation.entities;

import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {
        @Before("execution(*  org.aop.implementation.aopimplementation.entities.PersonneRepository.*(..))")
        public void insertion(){
            System.err.println("insertion");
        }
}
