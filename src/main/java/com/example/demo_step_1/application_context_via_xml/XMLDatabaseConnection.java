package com.example.demo_step_1.application_context_via_xml;

public class XMLDatabaseConnection {

    public XMLDatabaseConnection() {
        System.out.println("XMLDatabaseConnection initialised");
    }

    public String getConnectionName(){
        return this.toString();
    }
}
