package com.tianwen.spring.advice;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * wangjq
 * 2019年07月30日  23:37
 */
@Component
public class MyAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.println("before...");
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("after...");
    }
}
