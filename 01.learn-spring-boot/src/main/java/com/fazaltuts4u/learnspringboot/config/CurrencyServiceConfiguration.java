package com.fazaltuts4u.learnspringboot.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//currency-service.url=
//currency-service.username=
//currency-service.key=
@ConfigurationProperties(prefix = "currency-service")
@Component
@Getter
@Setter
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String key;
}
