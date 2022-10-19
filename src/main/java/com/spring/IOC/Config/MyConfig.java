package com.spring.IOC.Config;

import com.spring.IOC.Bean.Bean01;
import com.spring.IOC.Bean.Bean02;
import com.spring.IOC.Bean.MyImportSelector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.spring.IOC.Bean")
@Import({org.apache.ibatis.session.Configuration.class,MyImportSelector.class})
public class MyConfig {

    @Bean
    Bean01 bean01()
    {
        return new Bean01();
    }

    Bean02 bean02;

    @Autowired
    public MyConfig(Bean02 bean02)
    {
        System.out.println("MyConfig create");
        this.bean02=bean02;
    }
}
