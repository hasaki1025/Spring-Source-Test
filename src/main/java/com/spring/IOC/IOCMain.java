package com.spring.IOC;

import com.spring.IOC.Config.MyConfig;
import org.apache.ibatis.session.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyConfig bean = context.getBean(MyConfig.class);
        System.out.println(bean);
    }
}
