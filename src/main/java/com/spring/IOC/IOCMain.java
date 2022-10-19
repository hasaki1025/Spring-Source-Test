package com.spring.IOC;

import com.spring.IOC.Config.MyConfig;
import com.spring.IOC.POJO.*;
import org.apache.ibatis.session.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class IOCMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class,liteConfig.class);
        System.out.println(context.getBean(liteConfig.SonComponent.class));
    }
}
