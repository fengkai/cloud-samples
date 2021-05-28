package org.apache.dubbo.examples.provider.spring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(InstantiationTracingBeanPostProcessor.class);
        context.register(BeanCounter.class);
        context.register(SimpleBean.class);
        context.refresh();
    }

}
