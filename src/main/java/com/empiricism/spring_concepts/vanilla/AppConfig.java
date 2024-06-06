package com.empiricism.spring_concepts.vanilla;

import com.empiricism.spring_concepts.depreciation.FurnitureDepreciationCalculator;
import com.empiricism.spring_concepts.depreciation.TechDepreciationCalculator;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "furnitureDepreciationCalculator")
    public FurnitureDepreciationCalculator createFurnitureDepreciationCalculator(){
        return new FurnitureDepreciationCalculator();
    }

    @Bean(name ="techDepreciationCalculator")
    public TechDepreciationCalculator createTechDepreciationCalculator(){
        return new TechDepreciationCalculator();
    }

    @Bean(name="techDepreciation")
    public DepreciationLooselyCoupled createTechDepreciation(){
        return new DepreciationLooselyCoupled(createTechDepreciationCalculator());
    }

    @Bean(name="furnDepreciation")
    public DepreciationLooselyCoupled createFurnDepreciation(){
        return new DepreciationLooselyCoupled(createTechDepreciationCalculator());
    }

}
