package com.example.demo_step_1.application_context_via_xml;

import com.example.demo_step_1.ScanComponentApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class XMLComponentApplication {
    static Logger LOGGER = LoggerFactory.getLogger(ScanComponentApplication.class);


    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")) {
            XMLPersonDao xmlPersonDao = applicationContext.getBean(XMLPersonDao.class);
            LOGGER.info("Beans Loaded :{}", (Object) applicationContext.getBeanDefinitionNames());
            XMLDatabaseConnection xmlDatabaseConnection = applicationContext.getBean(XMLDatabaseConnection.class);


            LOGGER.debug("{}", xmlPersonDao);
            LOGGER.debug("{}", xmlDatabaseConnection);
        }
    }
}
