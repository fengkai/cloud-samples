package com.example.dubbo.annotation.action;

import com.example.dubbo.annotation.AnnotationConstants;
import com.example.dubbo.annotation.api.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Component;

@Component
public class DubboAction {

    @DubboReference(interfaceClass = HelloService.class, version = AnnotationConstants.VERSION)
    private HelloService helloService;


    public String doSayHello() {
        try {
            return helloService.sayHello();
        } catch (Exception e) {
            e.printStackTrace();
            return "Throw Exception";
        }
    }
}
