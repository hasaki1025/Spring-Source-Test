package com.spring.IOC.POJO;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class MyComponent {

    private String name;
    public String id;

}
