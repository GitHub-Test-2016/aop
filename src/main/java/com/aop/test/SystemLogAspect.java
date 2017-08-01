package com.aop.test;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author yangwenliang, wenliang.yang@htouhui.com
 * @version 1.0
 */
@Aspect
@Component
public class SystemLogAspect {
    
    @After("@annotation(Log)")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("systemLogAspect");
    }
}
