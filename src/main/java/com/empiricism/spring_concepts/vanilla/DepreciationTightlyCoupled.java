package com.empiricism.spring_concepts.vanilla;

import com.empiricism.spring_concepts.depreciation.FurnitureDepreciationCalculator;

public class DepreciationTightlyCoupled {

    // Tightly coupled to FurnitureDepreciationCalculator
    private FurnitureDepreciationCalculator depreciationCalculator = new FurnitureDepreciationCalculator();
    public int calculateDepreciation(int amount, int year){
       return depreciationCalculator.calculateDepreciation(amount, year);
    }

}
