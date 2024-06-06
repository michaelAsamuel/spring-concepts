package com.empiricism.spring_concepts.vanilla;

import com.empiricism.spring_concepts.depreciation.DepreciationCalculator;
import org.springframework.stereotype.Component;

@Component
public class DepreciationLooselyCoupled {

    // Note Type is the interface
    private DepreciationCalculator depreciationCalculator;

    // Constructor Injection is a typical implementation of Dependancy injection
    public DepreciationLooselyCoupled(DepreciationCalculator depreciationCalculator) {
        this.depreciationCalculator = depreciationCalculator;
    }

    public DepreciationLooselyCoupled() {

    }

    public DepreciationCalculator getDepreciationCalculator() {
        return depreciationCalculator;
    }

    public void setDepreciationCalculator(DepreciationCalculator depreciationCalculator) {
        this.depreciationCalculator = depreciationCalculator;
    }

    public int calculateDepreciation(int amount, int year) {
        if (year > 4 || year == 0)
            return 0;
        else
            return depreciationCalculator.calculateDepreciation(amount, year);
    }
}
