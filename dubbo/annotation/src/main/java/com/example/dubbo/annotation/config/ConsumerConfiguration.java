package com.example.dubbo.annotation.config;

import com.example.dubbo.annotation.action.DubboAction;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackageClasses = DubboAction.class)
@PropertySource("classpath:/consumer.properties")
@Import(DubboAction.class)
public class ConsumerConfiguration {
}
