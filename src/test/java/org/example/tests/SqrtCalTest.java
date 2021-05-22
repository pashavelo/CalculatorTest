package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtCalTest extends BaseTest{

    @Test(dataProvider = "valuesForSqrtTest")
    public void sqrtTest(double a, double expectedValue){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of sqrt operation!");
    }

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][] {
                {100, 10},
                {25, 5},
                {0, 0},
                {16, 4}
        };
    }

}
