package com.example.demo_step_1.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
/// Below scope will not work so modifying it slightly
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
/// Modified scope to below added proxy mode in order to create new objects of JdbcConnection everytime the object is called from context.getBean()
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JdbcConnection {

    public JdbcConnection() {
        System.out.println("JdbcConnection initialised...");
    }

    public void connect() {
        System.out.println(this +" Connected...!");
    }
}
