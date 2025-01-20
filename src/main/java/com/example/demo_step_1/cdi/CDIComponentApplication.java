package com.example.demo_step_1.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
///  Use component scan annotation to find beans
/// in different packages other than Application class
@ComponentScan("com.example.demo_step_1.cdi")
public class CDIComponentApplication {

    static Logger LOGGER = LoggerFactory.getLogger(CDIComponentApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CDIComponentApplication.class, args);

        /// Component Scan : Component scan from diff packages
        CDIBusiness cdiBusiness = context.getBean(CDIBusiness.class);
        CDIObject cdiObject = context.getBean(CDIObject.class);

        LOGGER.debug("{}", cdiBusiness);
        LOGGER.debug("{}", cdiObject);
    }


}
