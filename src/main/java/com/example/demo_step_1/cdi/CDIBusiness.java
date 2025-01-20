package com.example.demo_step_1.cdi;

import javax.inject.Named;

@Named
public class CDIBusiness {
    public CDIBusiness() {
        System.out.println("CDIBussiness initialised...");
    }
}
