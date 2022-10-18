package com.spring.IOC.POJO;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class liteConfig {
    @Bean
    public Bean03 bean03()
    {
        return new Bean03();
    }

}
