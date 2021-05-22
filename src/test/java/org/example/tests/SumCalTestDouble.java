package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalTestDouble extends BaseTest{

    @Test(dataProvider = "valuesForSumDoubleTest", groups= {"first"})
    public void plusTest(double a, double b, double expectedValue){
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sum operation!");
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {1.5, 2.5, 4},
                {2.5, -1, 1.5},
                {0.5, 0.5, 1},
                {-1.8, 10, 8.2}
        };
    }
}
