package com.example.demo_step_1.mockito_test_example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WorkerApplication {

    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("workerContext.xml")){
            WorkerBusiness workerBusiness = applicationContext.getBean(WorkerBusiness.class);

        }
    }
}
