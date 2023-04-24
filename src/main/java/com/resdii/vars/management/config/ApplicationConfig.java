package com.resdii.vars.management.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class ApplicationConfig {
    @Value("${media-server.public-url:}")
    private String mediaServerURL;

    @Value("${microservice.land-cms.public-url:}")
    private String landPublicUrl;
}
