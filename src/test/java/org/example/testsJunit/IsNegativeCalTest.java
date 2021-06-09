package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;

public class IsNegativeCalTest extends BaseTestJunit {

    @Test
    public void isNegativeTest(){
        boolean result = calculator.isNegative(-2);
        Assert.assertTrue("Invalid isNegative test", result);
    }

}
