package com.empiricism.spring_concepts.vanilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepreciationTightlyCoupledTest {

    @Test
    void calculateDepreciation() {
        DepreciationTightlyCoupled depreciationCalculator = new DepreciationTightlyCoupled();
        assertEquals(2000, depreciationCalculator.calculateDepreciation(10000, 3));
        assertEquals(0, depreciationCalculator.calculateDepreciation(10000, 6));
    }




}