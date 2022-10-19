package com.spring.IOC.Imported;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

public class DeferredImnportSelectorTest implements DeferredImportSelector {
    @Override
    public Class<? extends Group> getImportGroup() {
        return DeferredImportSelector.super.getImportGroup();
    }

    @Override
    public Predicate<String> getExclusionFilter() {
        return (x)->{//只导入com.spring.IOC.Imported包下的
            return !x.startsWith("com.spring.IOC.Imported");
        };
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.spring.IOC.POJO.Bean05","com.spring.IOC.Imported.Bean06"};
    }
}
