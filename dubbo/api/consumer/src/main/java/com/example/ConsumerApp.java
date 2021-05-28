package com.example;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.examples.GreetingsService;

public class ConsumerApp {

    private static String zookeeperHost = System
            .getProperty("zookeeper.address", "127.0.0.1");
    private static String zookeeperPort = System.getProperty("zookeeper.port",
            "2181");

    public static void main(String[] args) {
        ReferenceConfig<GreetingsService> reference = new ReferenceConfig<>();
        reference.setApplication(new ApplicationConfig("first-dubbo-consumer"));
        reference.setRegistry(new RegistryConfig(
                "zookeeper://" + zookeeperHost + ":" + zookeeperPort));
        reference.setInterface(GreetingsService.class);
        GreetingsService service = reference.get();
        String message = service.sayHello();
        System.out.println(message);
    }

}
