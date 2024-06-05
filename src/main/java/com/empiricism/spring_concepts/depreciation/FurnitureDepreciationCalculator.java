package com.empiricism.spring_concepts.depreciation;

import org.springframework.stereotype.Component;

@Component
public class FurnitureDepreciationCalculator implements DepreciationCalculator{

    /*
    Furniture is depreciated over a 5 year period at fixed rate of
    20% purchase value
     */
    @Override
    public int calculateDepreciation(int amount, int year) {
        if(year > 5)
            return  0;
        else
            return (int) (amount / 5);
    }
}
