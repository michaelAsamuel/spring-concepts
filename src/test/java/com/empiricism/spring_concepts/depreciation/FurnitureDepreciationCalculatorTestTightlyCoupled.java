package com.empiricism.spring_concepts.depreciation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FurnitureDepreciationCalculatorTestTightlyCoupled {

    @Test
    void calculateDepreciationwithin5years() {
        FurnitureDepreciationCalculator furnitureDepreciationCalculator = new FurnitureDepreciationCalculator();
        assertEquals(3000, furnitureDepreciationCalculator.calculateDepreciation(15000, 3));
        assertEquals(0, furnitureDepreciationCalculator.calculateDepreciation(15000,6));
    }
}