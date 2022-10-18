package com.spring.IOC.POJO;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean.getClass().equals(MyBean.class))
        {

            MyBean bean1 = new MyBean();
            bean1.setName("good");
            bean1.setId(1);
            return null;
        }
        System.out.println("postProcessBeforeInitialization"+"bean:"+bean);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+"bean:"+bean);
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
