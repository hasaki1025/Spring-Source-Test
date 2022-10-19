package com.spring.IOC.Bean;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;
@Component
public class MyDeferredImportSelector implements DeferredImportSelector {
    public MyDeferredImportSelector() {
        System.out.println("DeferredImportSelector create");
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.spring.IOC.Bean.Bean06"};
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return x->{return x.startsWith("com.spring.IOC.Bean");};
    }
}
