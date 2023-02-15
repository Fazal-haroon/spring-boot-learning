package com.fazaltuts4u.learnspringboot.controller;

import com.fazaltuts4u.learnspringboot.config.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;

    @RequestMapping("/currency-config")
    public CurrencyServiceConfiguration currencyServiceConfiguration(){
        return currencyServiceConfiguration;
    }
}
