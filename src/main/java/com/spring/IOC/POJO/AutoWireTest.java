package com.spring.IOC.POJO;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AutoWireTest implements InitializingBean, DisposableBean {

    @Autowired
    void AutowireMyBean(MyComponent myComponent)
    {
        System.out.println(myComponent);
    }
    @PostConstruct
    public void init()
    {
        System.out.println("this PostConstruct method");
    }
    @PreDestroy
    public void Destroy()
    {
        System.out.println("this  is Destroy method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("this destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this is after propertiesSet method");
    }
}
