package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalTestDouble extends BaseTest{

    @Test(dataProvider = "valuesForSubTestDouble", groups= "first")
    public void minusTest(double a, double b, double expectedValue){
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation!");
    }

    @DataProvider(name = "valuesForSubTestDouble")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {20.3, 10, 10.3},
                {10.5, -1.7, 12.2},
                {0.9, 0.4, 0.5},
                {5.7, 9.5, -3.8}
        };
    }
}
