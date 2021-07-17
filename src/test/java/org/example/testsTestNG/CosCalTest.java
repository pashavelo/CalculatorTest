package org.example.testsTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosCalTest extends BaseTest {

    @Test(dataProvider = "valuesForCosTest")
    public void cosTest(double a, double expectedValue){
        double result = calculator.cos(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of cos operation!");
    }

    @DataProvider(name = "valuesForCosTest")
    public Object[][] valuesForCos() {
        return new Object[][] {
                {15, 0.9659},
                {30, 0.8660},
                {60, 0.5000},
                {45, 0.7071},
                {50, 0.6428}
        };
    }

}
