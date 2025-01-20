package com.example.demo_step_1.spring_core_library;

import component_scan.component_scan.MyComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


///  Use component scan annotation to find beans
/// in different packages other than Application class

@Configuration
@ComponentScan("component_scan.component_scan")
public class CustomSpringApplication {

    static Logger LOGGER = LoggerFactory.getLogger(CustomSpringApplication.class);

    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CustomSpringApplication.class)){

            /// Component Scan : Component scan from diff packages

            MyComponent component = context.getBean(MyComponent.class);

            LOGGER.debug("{}", component);
        }
    }
}
