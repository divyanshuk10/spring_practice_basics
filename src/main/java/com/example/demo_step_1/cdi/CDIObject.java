package com.example.demo_step_1.cdi;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class CDIObject {

    CDIBusiness cdiBusiness;

    public CDIBusiness getCdiBusiness() {
        return cdiBusiness;
    }
}
