package com.empiricism.spring_concepts.vanilla;

import com.empiricism.spring_concepts.depreciation.FurnitureDepreciationCalculator;
import com.empiricism.spring_concepts.depreciation.TechDepreciationCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepreciationClient {
    public static void main(String[] args){
//        demoJavaInjection();
        demoSpringXmlInjection();
//        demoSpringAnnotationInjection();
//        demoSpringAnnotationSetterInjection();

    }

    private static void demoSpringAnnotationSetterInjection() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfigSetter.class);
        DepreciationLooselyCoupled depreciationLooselyCoupled =applicationContext.getBean("furnDepreciation", DepreciationLooselyCoupled.class);
        System.out.println(depreciationLooselyCoupled.calculateDepreciation(10000, 1));
        depreciationLooselyCoupled = applicationContext.getBean("techDepreciation", DepreciationLooselyCoupled.class);
        System.out.println(String.format("Setter injection for Tech %s",depreciationLooselyCoupled.calculateDepreciation(10000, 1)));
    }

    private static void demoSpringAnnotationInjection() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        DepreciationLooselyCoupled depreciationLooselyCoupled =applicationContext.getBean("furnDepreciation", DepreciationLooselyCoupled.class);
        System.out.println(depreciationLooselyCoupled.calculateDepreciation(10000, 1));
        depreciationLooselyCoupled = applicationContext.getBean("techDepreciation", DepreciationLooselyCoupled.class);
        System.out.println(depreciationLooselyCoupled.calculateDepreciation(10000, 1));
    }

    private static void demoSpringXmlInjection() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        DepreciationLooselyCoupled depreciationLooselyCoupled =applicationContext.getBean("furnDepreciation", DepreciationLooselyCoupled.class);
        System.out.println(String.format("XML Setter injection for Furn %s",depreciationLooselyCoupled.calculateDepreciation(10000, 1)));
        depreciationLooselyCoupled = applicationContext.getBean("techDepreciation", DepreciationLooselyCoupled.class);
        System.out.println(String.format("XML Setter injection for Tech %s",depreciationLooselyCoupled.calculateDepreciation(10000, 1)));
    }

    private static void demoJavaInjection() {
        var depreciation = new DepreciationLooselyCoupled(new TechDepreciationCalculator());
        System.out.println(   depreciation.calculateDepreciation(10000, 1));
        depreciation = new DepreciationLooselyCoupled(new FurnitureDepreciationCalculator());
        System.out.println(   depreciation.calculateDepreciation(10000, 1));
    }
}
