package com.example.demo_step_1.lifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LifeCycleApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LifeCycleApplication.class);
        LifeCycleDao lifeCycleDao = context.getBean(LifeCycleDao.class);
        lifeCycleDao.test();
    }
}
