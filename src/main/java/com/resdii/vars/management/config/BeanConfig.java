package com.resdii.vars.management.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    private ApplicationConfig appConfig;

    @Autowired
    public void setAppConfig(ApplicationConfig appConfig) {
        this.appConfig = appConfig;
    }
}
