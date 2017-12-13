package com.api.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class APIConfig {

    @Value("${rest.api.name}")
    private String name;

}
