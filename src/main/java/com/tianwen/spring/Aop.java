package com.tianwen.spring;

import com.tianwen.spring.service.TestServiceB;
import com.tianwen.spring.service.TestServiceI;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * wangjq
 * 2019年07月30日  23:32
 */
public class Aop {

    @Test
    public void test1() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.tianwen.spring");
        TestServiceI testService = (TestServiceI) context.getBean("proxyFactoryBeanA");
        testService.method1();
        System.out.println("---");
        testService.method2();
        System.out.println("---");
        TestServiceB testServiceB = (TestServiceB) context.getBean("proxyFactoryBeanB");
        testServiceB.method1();
    }
}
