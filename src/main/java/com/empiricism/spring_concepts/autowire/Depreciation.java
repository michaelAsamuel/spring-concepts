package com.empiricism.spring_concepts.autowire;

import com.empiricism.spring_concepts.depreciation.DepreciationCalculator;
import com.empiricism.spring_concepts.depreciation.FurnitureDepreciationCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Depreciation {


    private DepreciationCalculator depreciationCalculator;

//    public Depreciation(DepreciationCalculator depreciationCalculator) {
//        this.depreciationCalculator = depreciationCalculator;
//    }

    @Autowired
//    public void setDepreciationCalculator(FurnitureDepreciationCalculator depreciationCalculator) {
//    public void setDepreciationCalculator(DepreciationCalculator furnitureDepreciationCalculator) {
    public void setDepreciationCalculator(@Qualifier("furnitureDepreciationCalculator") DepreciationCalculator depreciationCalculator) {
            this.depreciationCalculator = depreciationCalculator;
    }
    public int calculateDepreciation(int amount, int year) {
        if (year > 4 || year == 0)
            return 0;
        else
            return depreciationCalculator.calculateDepreciation(amount, year);
    }

}
