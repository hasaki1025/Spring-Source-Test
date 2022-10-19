package com.spring.IOC.Bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

@Component
public class MyImportSelector implements ImportSelector {
    public MyImportSelector() {
        System.out.println("MyImportSelector create");
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.spring.IOC.Bean.Bean05"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return ImportSelector.super.getExclusionFilter();
    }
}
