package com.empiricism.spring_concepts.depreciation;

import org.springframework.beans.factory.annotation.Autowired;

public interface DepreciationCalculator {

    public int calculateDepreciation(int amount, int year );

}
