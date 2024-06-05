package com.empiricism.spring_concepts.depreciation;

import org.springframework.stereotype.Component;

@Component
public class TechDepreciationCalculator implements DepreciationCalculator{

    /* Tech products like laptops are depreciated
        Year 1: 40%
        Year 2: 35%
        Year 3: 25%
     */
    @Override
    public int calculateDepreciation(int amount, int year) {
        if(year ==1 )
            return (int) (amount * .40);
        else if(year ==2)
            return  (int) (amount * .35);
        else if (year ==3)
            return  (int) (amount * .25);
        else return  0;
    }
}
