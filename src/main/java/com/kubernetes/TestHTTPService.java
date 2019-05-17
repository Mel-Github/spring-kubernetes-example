package com.kubernetes;


import com.kubernetes.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestHTTPService {

    @Autowired
    private Config config;

    @Value("${myconfig.properties1}")
    private String properties1;

    @Value("${spring.datasource.url}")
    private String jdbcUrl;

    @GetMapping("config-autoreload")
    public String configAutoReload() {
        return "myconfig.properties1: " + config.getProperties1() + "\n"+
                "myconfig.properties2: " + config.getProperties2() + "\n"+
                "myconfig.subconfig1.properties1: " + config.getSubconfig1().getProperties1() + "\n"+
                "myconfig.subconfig1.properties2: " + config.getSubconfig1().getProperties2() + "\n"+
                "myconfig.subconfig2.properties2: " + config.getSubconfig2().get("properties1") + "\n"+
                "myconfig.subconfig2.properties2: " + config.getSubconfig2().get("properties2") + "\n"
                ;
    }

    @GetMapping("config-value")
    public String configFromValue() {
        return "properties1: " + properties1 +  "jdbc url is " + jdbcUrl + "\n";
    }

    @GetMapping("secret")
    public String secret() {
        return "username: " + System.getenv("username") + "\n"+
                "password: " + System.getenv("password") + "\n";
    }
}