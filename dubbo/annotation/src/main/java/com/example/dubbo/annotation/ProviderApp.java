package com.example.dubbo.annotation;

import com.example.dubbo.annotation.config.ProviderConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.CountDownLatch;

public class ProviderApp {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(ProviderConfig.class);
        annotationConfigApplicationContext.refresh();

        new CountDownLatch(1).await();;
    }

}
