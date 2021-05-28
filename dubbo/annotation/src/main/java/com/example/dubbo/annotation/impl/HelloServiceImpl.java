package com.example.dubbo.annotation.impl;

import com.example.dubbo.annotation.AnnotationConstants;
import com.example.dubbo.annotation.api.HelloService;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.config.annotation.Method;

@DubboService(version = AnnotationConstants.VERSION, methods = {@Method(name = "sayGoodbye", timeout = 250, retries = 0)})
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        return "Hello annotation!";
    }


    public String sayGoodbye(String name) {
        System.out.println("provider received invoke of sayGoodbye: " + name);
//        sleepWhile();
        return "Goodbye, " + name;
    }
}
