package com.example.demo_step_1;

import component_scan.component_scan.MyComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
///  Use component scan annotation to find beans
/// in different packages other than Application class
@ComponentScan("component_scan.component_scan")
public class ScanComponentApplication {

    static Logger LOGGER = LoggerFactory.getLogger(ScanComponentApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ScanComponentApplication.class, args);

        /// Component Scan : Component scan from diff packages
        MyComponent component = context.getBean(MyComponent.class);

        LOGGER.debug("{}", component);
    }


}
