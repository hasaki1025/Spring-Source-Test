package com.spring.IOC.Config;

import com.spring.IOC.POJO.MyBean;
import com.spring.IOC.POJO.MyComponent;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {"com.spring.IOC.POJO"})
@Import(org.apache.ibatis.session.Configuration.class)
@Data
public class MyConfig {


    @Autowired
    public org.apache.ibatis.session.Configuration configuration;

    @Autowired
    public MyComponent myComponent;

    @Autowired
    public MyBean myBean;

    @Bean
    public MyBean myBean()
    {
        return new MyBean();
    }
}
