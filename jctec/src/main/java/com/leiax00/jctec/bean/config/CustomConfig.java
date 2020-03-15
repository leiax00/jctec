package com.leiax00.jctec.bean.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@PropertySource(value = "classpath:custom-conf.yml")
@ConfigurationProperties(prefix = "jctec")
public class CustomConfig {
    @Value("${param1}")
    private String param1;

    @Value("${param2}")
    private List<String> param2;
}
