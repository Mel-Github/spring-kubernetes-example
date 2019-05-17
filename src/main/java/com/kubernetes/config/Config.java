package com.kubernetes.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.Map;

//@Configuration
@ConfigurationProperties(prefix = "myconfig")
public class Config implements Serializable {

    private static final long serialVersionUID = 1L;

    private String properties1;

    private String properties2;

    private SubConfig subconfig1;

    private Map<String, String> subconfig2;


    public String getProperties1() {
        return properties1;
    }

    public void setProperties1(String properties1) {
        this.properties1 = properties1;
    }

    public String getProperties2() {
        return properties2;
    }

    public void setProperties2(String properties2) {
        this.properties2 = properties2;
    }

    public SubConfig getSubconfig1() {
        return subconfig1;
    }

    public void setSubconfig1(SubConfig subconfig1) {
        this.subconfig1 = subconfig1;
    }

    public Map<String, String> getSubconfig2() {
        return subconfig2;
    }

    public void setSubconfig2(Map<String, String> subconfig2) {
        this.subconfig2 = subconfig2;
    }
}

