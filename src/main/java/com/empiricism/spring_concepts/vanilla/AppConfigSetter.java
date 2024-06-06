package com.empiricism.spring_concepts.vanilla;

import com.empiricism.spring_concepts.depreciation.FurnitureDepreciationCalculator;
import com.empiricism.spring_concepts.depreciation.TechDepreciationCalculator;
import org.springframework.context.annotation.Bean;

public class AppConfigSetter {

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
        var depClient = new DepreciationLooselyCoupled();
        depClient.setDepreciationCalculator(createTechDepreciationCalculator());
        return depClient;
    }

    @Bean(name="furnDepreciation")
    public DepreciationLooselyCoupled createFurnDepreciation(){
        var depClient = new DepreciationLooselyCoupled();
        depClient.setDepreciationCalculator(createFurnitureDepreciationCalculator());
        return depClient;

    }

}
