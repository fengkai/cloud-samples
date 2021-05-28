package org.apache.dubbo.examples.provider.spi.provider;

import org.apache.dubbo.examples.provider.spi.DemoService;

public class DemoServiceProvider implements DemoService {
    
    @Override
    public String sayHello() {
        return "hello world";
    }
}
