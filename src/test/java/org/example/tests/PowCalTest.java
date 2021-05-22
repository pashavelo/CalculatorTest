package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowCalTest extends BaseTest{

    @Test(dataProvider = "valuesForPowTest")
    public void powTest(double a, double b, double expectedValue){
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of pow operation!");
    }

    @DataProvider(name = "valuesForPowTest")
    public Object[][] valuesForPow() {
        return new Object[][] {
                {2, 4, 16},
                {10, 2, 100},
                {5, 6, 15625},
                {12, 3, 1728}
        };
    }

}
