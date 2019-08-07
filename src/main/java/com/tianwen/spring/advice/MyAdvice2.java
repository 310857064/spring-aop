package com.tianwen.spring.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

/**
 * wangjq
 * 2019年07月30日  23:37
 */
@Component
public class MyAdvice2 implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Object retVal = invocation.proceed();
        System.out.println("after22222");
        return retVal;
    }
}
