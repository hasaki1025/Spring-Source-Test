package com.spring.IOC;

import com.spring.IOC.Config.MyConfig;
import com.spring.IOC.POJO.*;
import org.apache.ibatis.session.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class IOCMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("容器中的Bean3（第一次获取）："+context.getBean(Bean03.class));
        System.out.println("容器中的Bean3（第二次获取）："+context.getBean(Bean03.class));
        liteConfig liteConfig = context.getBean(liteConfig.class);
        System.out.println("容器中的liteconfig："+liteConfig);
        System.out.println("调用liteconfig中的Bean03方法（第一次调用）："+liteConfig.bean03());
        System.out.println("调用liteconfig中的Bean03方法（第二次调用）："+liteConfig.bean03());
    }
}
