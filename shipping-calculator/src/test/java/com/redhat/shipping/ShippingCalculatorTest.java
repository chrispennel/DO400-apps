package com.redhat.shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    // @todo: add tests
    @Test
    public void onAnonsupportedRegionNOtFoundExceptionisRaised() throws RegionNotFoundException {
        ShippingCalculator calculator = new ShippingCalculator();
        assertThrows(
            RegionNotFoundException.class, () -> calculator.costForRegion("Unknown Region")
        );
    }

    @Test
    public void onNARegionTheCostis100() throws RegionNotFoundException {
        //Given
        ShippingCalculator calculator = new ShippingCalculator();
        
        //When
        int calculatedCost = calculator.costForRegion("NA");
        
        //Then
        assertEquals(100,calculatedCost);
    }

    @Test
    public void onLATAMRegionTheCostis200() throws RegionNotFoundException {
        //Given
        ShippingCalculator calculator = new ShippingCalculator();

        //When
        int calculatedCost = calculator.costForRegion("LATAM");

        //Then
        assertEquals(200,calculatedCost);
    }

    @Test
    public void onEMEARegionTheCostis300() throws RegionNotFoundException {
        //Given
        ShippingCalculator calculator = new ShippingCalculator();

        //When
        int calculatedCost = calculator.costForRegion("EMEA");

        //Then
        assertEquals(300, calculatedCost);
    }

    @Test
    public void onAPACRegionTheCostis400 () throws RegionNotFoundException {
        //Given
        ShippingCalculator calculator = new ShippingCalculator();
        
        //When
        int calculatedCost = calculator.costForRegion("APAC");

        //Then
        assertEquals(400, calculatedCost);
    }
}
