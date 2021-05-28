package com.example.dubbo.annotation;

import com.example.dubbo.annotation.action.DubboAction;
import com.example.dubbo.annotation.config.ConsumerConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConsumerApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext();
        ioc.register(ConsumerConfiguration.class);
        ioc.refresh();
        DubboAction bean = ioc.getBean(DubboAction.class);
        System.out.println(bean.doSayHello());
    }
}
