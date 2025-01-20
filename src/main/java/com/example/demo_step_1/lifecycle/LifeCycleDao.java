package com.example.demo_step_1.lifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;


//gof - singleton per JVM
//
//spring - singleton per spring application
//
//JVM can have multiple spring applications

@Component
public class LifeCycleDao {

    public LifeCycleDao() {
        System.out.println("Constructor called");
    }

    void test(){
        System.out.println("test called");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post Construct called");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Pre Destroy called");
    }
}