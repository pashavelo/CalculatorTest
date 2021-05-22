package org.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalTest extends BaseTest{

    @Test
    public void isNegativeTest(){
        boolean result = calculator.isNegative(-2);
        Assert.assertTrue(result,"Invalid isNegative test");
    }

}
