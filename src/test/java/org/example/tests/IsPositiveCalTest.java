package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalTest extends BaseTest{

    @Test
    public void isPositiveTest(){
        boolean result = calculator.isPositive(1);
        Assert.assertTrue(result, "Invalid result of positive test");
    }

}
