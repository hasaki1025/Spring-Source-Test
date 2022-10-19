package com.spring.IOC.POJO;

import com.spring.IOC.Imported.ImportTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Configuration
public class liteConfig {
    @Bean
    public Bean03 bean03()
    {
        return new Bean03();
    }
    @Component
    public class SonComponent{
        String name;
        String id;
    }
}
