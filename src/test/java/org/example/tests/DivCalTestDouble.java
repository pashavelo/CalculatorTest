package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalTestDouble extends BaseTest{

    @Test(dataProvider = "valuesForDivDoubleTest", groups= "first")
    public void divTest(double a, double b, double expectedValue){
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of div operation!");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divByZero() {
        double i = 5.44/0;
    }

    @DataProvider(name = "valuesForDivDoubleTest")
    public Object[][] valuesForDiv() {
        return new Object[][] {
                {4.84, 2.2, 2.2},
                {27.5, 5, 5.5},
                {20.44, 0.4, 51.1},
                {12.6, 3, 4.2}
        };
    }

}
