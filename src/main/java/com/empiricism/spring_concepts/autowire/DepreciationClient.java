package com.empiricism.spring_concepts.autowire;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class DepreciationClient {

    public static void main(String[] args){
        demoSpringAutoSetterInjection();

    }
    private static void demoSpringAutoSetterInjection() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigAuto.class);
        Depreciation depreciation =applicationContext.getBean("depreciation", Depreciation.class);
        System.out.println(depreciation.calculateDepreciation(10000, 1));

    }
}
