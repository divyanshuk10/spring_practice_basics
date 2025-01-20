package com.example.demo_step_1.external_properties;

import com.example.demo_step_1.DemoStep1Application;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:base.properties")
public class ExternalPropertiesApplication {
    static Logger LOGGER = LoggerFactory.getLogger(DemoStep1Application.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExternalPropertiesApplication.class)) {
            ExternalProperties properties = applicationContext.getBean(ExternalProperties.class);

            LOGGER.info("Properties  >>>> {}", properties);

        }
    }
}
