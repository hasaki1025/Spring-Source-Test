package com.spring.IOC.POJO;

import org.springframework.stereotype.Component;

@Component
public class Bean01 {
    public String name;
    public String id;

    void init()
    {
        System.out.println("this is bean01 init method");
    }

    void destory()
    {
        System.out.println("this is bean01 destory method");
    }
}
