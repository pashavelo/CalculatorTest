package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtgCalTest extends BaseTest{

    @Test(dataProvider = "valuesForCtgTest")
    public void ctgTest(double a, double expectedValue){
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of ctg operation!");
    }

    @DataProvider(name = "valuesForCtgTest")
    public Object[][] valuesForCtg() {
        return new Object[][] {
                {15.0, 3.7321},
                {30.0, 1.7321},
                {60.0, 0.5774},
                {45.0, 1.0},
                {50.0, 0.8391}
        };
    }

}
