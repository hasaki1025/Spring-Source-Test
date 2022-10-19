package com.spring.IOC.POJO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Bean02 {
    public String name;
    public String id;
    @Autowired
    Bean01 bean01;
    @PostConstruct
    void init()
    {
        System.out.println("this is bean02 init method");
    }
    @PreDestroy
    void destory()
    {
        System.out.println("this is bean02 destory method");
    }
}
