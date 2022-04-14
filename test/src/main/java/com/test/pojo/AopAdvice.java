package com.test.pojo;

import lombok.ToString;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
@ToString
public class AopAdvice implements MethodBeforeAdvice, AfterReturningAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName());

        System.out.println("通过Advice实现AOP-Before");
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {

        System.out.println(returnValue);
        System.out.println("通过Advice实现AOP-after");
    }
}
