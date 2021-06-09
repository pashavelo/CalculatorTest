package org.example.testsTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinCalTest extends BaseTest{

    @Test(dataProvider = "valuesForSinTest")
    public void sinTest(double a, double expectedValue){
        double result = calculator.sin(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of sin operation!");
    }

    @DataProvider(name = "valuesForSinTest")
    public Object[][] valuesForSin() {
        return new Object[][] {
                {15, 0.2588},
                {30, 0.5000},
                {60, 0.8660},
                {45, 0.7071},
                {50, 0.7660}
        };
    }

}
