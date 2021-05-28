package org.apache.dubbo.examples.provider.nacos.service.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosServiceProviderApplication {

    public static void main(String[] args) {
        new SpringApplication(NacosServiceProviderApplication.class).run(args);
    }

    @Value("${server.port}")
    private String port;

    @RestController
    class EchoController {
        @RequestMapping(value = "/echo/{string}", method = RequestMethod.GET)
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string +" from " + port;
        }
    }
}
