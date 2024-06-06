package com.empiricism.spring_concepts.autowire;

import com.empiricism.spring_concepts.depreciation.FurnitureDepreciationCalculator;
import com.empiricism.spring_concepts.depreciation.TechDepreciationCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.empiricism.spring_concepts")
public class AppConfigAuto {

}
