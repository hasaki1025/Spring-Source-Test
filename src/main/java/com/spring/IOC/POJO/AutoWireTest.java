package com.spring.IOC.POJO;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AutoWireTest{

    @Autowired
    void AutowireMyBean(MyComponent myComponent)
    {
        System.out.println(myComponent);
    }


}
