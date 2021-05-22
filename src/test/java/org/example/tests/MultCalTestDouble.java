package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalTestDouble extends BaseTest{

    @Test(dataProvider = "valuesForMultDoubleTest", groups= "first")
    public void plusTest(double a, double b, double expectedValue){
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of mult operation!");
    }

    @DataProvider(name = "valuesForMultDoubleTest")
    public Object[][] valuesForMult() {
        return new Object[][] {
                {5.2, 2.2, 11.44},
                {10.7, -2.5, -26.75},
                {0.4, 0.2, 0.08},
                {2.1, 6.1, 12.81}
        };
    }

}
