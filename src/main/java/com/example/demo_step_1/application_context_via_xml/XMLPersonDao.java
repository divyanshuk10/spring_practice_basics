package com.example.demo_step_1.application_context_via_xml;


public class XMLPersonDao {

    XMLDatabaseConnection xmlDatabaseConnection;

    public XMLPersonDao(XMLDatabaseConnection xmlDatabaseConnection) {
        this.xmlDatabaseConnection = xmlDatabaseConnection;
    }

    public XMLDatabaseConnection getXmlDatabaseConnection() {
        return xmlDatabaseConnection;
    }

    public void setXmlDatabaseConnection(XMLDatabaseConnection xmlDatabaseConnection) {
        this.xmlDatabaseConnection = xmlDatabaseConnection;
    }

    public String getName(){
        String connectionName = xmlDatabaseConnection.getConnectionName();
        return connectionName;
    }
}
