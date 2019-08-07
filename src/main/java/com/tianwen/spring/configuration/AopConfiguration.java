package com.tianwen.spring.configuration;

import com.tianwen.spring.service.TestServiceA;
import com.tianwen.spring.service.TestServiceB;
import com.tianwen.spring.service.TestServiceI;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * wangjq
 * 2019年07月30日  23:33
 */
@Configuration
public class AopConfiguration {

    @Autowired
    private TestServiceA testServiceA;
    @Autowired
    private TestServiceB testServiceB;

    @Bean
    public ProxyFactoryBean proxyFactoryBeanA() throws ClassNotFoundException {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setProxyInterfaces(new Class[]{TestServiceI.class});
        proxyFactoryBean.setTarget(testServiceA);
        proxyFactoryBean.setInterceptorNames("myAdvice2", "myAdvice", "myAdvice1");
        return proxyFactoryBean;
    }

    @Bean
    public ProxyFactoryBean proxyFactoryBeanB() {
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(testServiceB);
        proxyFactoryBean.setInterceptorNames("myAdvice", "myAdvice1", "myAdvice2");
        return proxyFactoryBean;
    }
}
