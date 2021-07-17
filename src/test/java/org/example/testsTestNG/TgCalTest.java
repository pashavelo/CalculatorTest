package org.example.testsTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TgCalTest extends BaseTest{

    @Test(dataProvider = "valuesForTgTest")
    public void tgTest(double a, double expectedValue){
        double result = calculator.tg(a);
        Assert.assertEquals(result, expectedValue, "Invalid result of tg operation!");
    }

    @DataProvider(name = "valuesForTgTest")
    public Object[][] valuesForTg() {
        return new Object[][] {
                {0, 0},
                {30, 0.5774},
                {60, 1.7321},
                {45, 1.0},
                {50, 1.1918}
        };
    }

}
