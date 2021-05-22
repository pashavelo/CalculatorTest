package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivCalTest extends BaseTest{

    @Test(dataProvider = "valuesForDivTest")
    public void divTest(long a, long b, long expectedValue){
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of div operation!");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void divByZero() {
        long i = 7/0;
    }

    @DataProvider(name = "valuesForDivTest")
    public Object[][] valuesForDiv() {
        return new Object[][] {
                {20, 2, 10},
                {10, 2, 5},
                {2, 2, 1},
                {12, 3, 4}
        };
    }

}
