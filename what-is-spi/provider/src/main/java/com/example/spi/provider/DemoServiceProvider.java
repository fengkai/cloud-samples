package com.example.spi.provider;

import com.example.spi.DemoService;

public class DemoServiceProvider implements DemoService {
    
    @Override
    public String sayHello() {
        return "hello world";
    }
}
