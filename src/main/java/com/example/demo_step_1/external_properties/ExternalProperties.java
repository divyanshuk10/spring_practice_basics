package com.example.demo_step_1.external_properties;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExternalProperties {

    @Value("${external.baseurl}")
    String baseUrl;
    @Value("${external.isProduction}")
    Boolean isProduction;
    @Value("${external.serverCount}")
    int serverCount;
    @Value("${external.version}")
    double version;

    public String getBaseUrl() {
        return baseUrl;
    }

    public Boolean getProduction() {
        return isProduction;
    }

    public int getServerCount() {
        return serverCount;
    }

    public double getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "ExternalProperties{" +
                "baseUrl='" + baseUrl + '\'' +
                ", isProduction=" + isProduction +
                ", serverCount=" + serverCount +
                ", version=" + version +
                '}';
    }
}
