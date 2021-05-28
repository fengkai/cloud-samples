package com.example.dubbo.annotation.api;

public interface HelloService {

    String sayHello();

    default String sayGoodbye(String name) {
        return "Goodbye, " + name;
    }

}
