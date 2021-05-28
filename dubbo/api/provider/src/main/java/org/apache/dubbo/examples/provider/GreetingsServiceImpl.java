package org.apache.dubbo.examples.provider;

import org.apache.dubbo.examples.GreetingsService;

public class GreetingsServiceImpl implements GreetingsService {
    @Override
    public String sayHello() {
        return "This is impl";
    }
}
