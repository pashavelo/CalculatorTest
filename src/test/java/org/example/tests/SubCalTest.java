package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubCalTest extends BaseTest {

    @Test(dataProvider = "valuesForSubTest")
    public void minusTest(long a, long b, long expectedValue){
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid result of sub operation!");
    }

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {23, 10, 13},
                {10, -1, 11},
                {0, 0, 0},
                {5, 10, -5}
        };
    }

}
