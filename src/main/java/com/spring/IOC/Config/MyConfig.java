package com.spring.IOC.Config;

import com.spring.IOC.POJO.AutoWireTest;
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
    org.apache.ibatis.session.Configuration configuration;

    @Autowired
    AutoWireTest autoWireTest;

    public MyComponent myComponent;


    @Autowired
    public MyConfig(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    @Bean
    public MyBean myBean()
    {
        System.out.println("create new  Mybean in IOC ");
        return new MyBean();
    }
}
