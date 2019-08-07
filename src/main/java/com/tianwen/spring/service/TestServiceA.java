package com.tianwen.spring.service;

import org.springframework.stereotype.Service;

/**
 * wangjq
 * 2019年07月30日  23:46
 */
@Service
public class TestServiceA implements TestServiceI {

    @Override
    public void method1() {
        System.out.println("TestServiceA method1...");
    }

    @Override
    public void method2() {
        System.out.println("TestServiceA method2...");
    }
}
