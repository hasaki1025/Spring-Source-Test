package com.spring.IOC.POJO;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class MyFactoryBean implements FactoryBean<Bean02> {
    @Override
    public Bean02 getObject() throws Exception {
        return new Bean02();
    }

    @Override
    public Class<?> getObjectType() {
        return Bean02.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
