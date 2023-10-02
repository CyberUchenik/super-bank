package com.example.superbank;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfiguration {

    @Bean
    public BankConfiguration bankController(){
        return new BankConfiguration();
    }


}
