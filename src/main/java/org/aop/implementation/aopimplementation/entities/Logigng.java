package org.aop.implementation.aopimplementation.entities;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logigng {
    @Before("@annotation(org.aop.implementation.aopimplementation.entities.Loggable)")
    public void getAll(){
        System.out.println("get data");
    }

}
