package com.spring.IOC.Bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class MyFactoryBean implements FactoryBean<Bean03> {
    public MyFactoryBean() {
        System.out.println("MyFactoryBean create");
    }

    @Override
    public Bean03 getObject() throws Exception {
        return new Bean03();
    }

    @Override
    public Class<?> getObjectType() {
        return Bean03.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
