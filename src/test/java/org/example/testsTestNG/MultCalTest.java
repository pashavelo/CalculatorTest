package org.example.testsTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultCalTest extends BaseTest {

    @Test(dataProvider = "valuesForMultTest")
    public void plusTest(long a, long b, long expectedValue){
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of mult operation!");
    }

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult() {
        return new Object[][] {
                {5, 5, 25},
                {10, -1, -10},
                {0, 0, 0},
                {2, 6, 12}
        };
    }

}
