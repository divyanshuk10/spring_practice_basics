package com.example.demo_step_1.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
    @Autowired
    JdbcConnection jdbcConnection;

    public void connectJdbc(){
        jdbcConnection.connect();
    }

}
