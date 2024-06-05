package com.empiricism.spring_concepts.vanilla;

import com.empiricism.spring_concepts.depreciation.FurnitureDepreciationCalculator;
import com.empiricism.spring_concepts.depreciation.TechDepreciationCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepreciationLooselyCoupledTest {

        @Test
        void calculateFurnitureDepreciation() {
            var depreciation = new DepreciationLooselyCoupled(new FurnitureDepreciationCalculator());
            assertEquals(2000, depreciation.calculateDepreciation(10000, 3));
            assertEquals(0, depreciation.calculateDepreciation(10000, 6));
        }

        @Test
        void calculateTechDepreciation() {
            var depreciation = new DepreciationLooselyCoupled(new TechDepreciationCalculator());
            assertEquals(4000, depreciation.calculateDepreciation(10000, 1));
            assertEquals(3500, depreciation.calculateDepreciation(10000, 2));
            assertEquals(2500, depreciation.calculateDepreciation(10000, 3));
            assertEquals(0, depreciation.calculateDepreciation(10000, 6));
        }



}