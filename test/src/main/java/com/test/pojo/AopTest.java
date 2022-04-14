package com.test.pojo;

import org.aspectj.lang.ProceedingJoinPoint;

public class AopTest {
    public void after(){
        System.out.println("方法执行之后。。。。");
    }
    public void before(){
        System.out.println("方法执行之前。。。。");
    }
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = joinPoint. proceed();
        System.out.println("环绕方法。。。。");
        return obj;
    }
}
