package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;

public class IsPositiveCalTest extends BaseTestJunit {

    @Test
    public void isPositiveTest(){
        boolean result = calculator.isPositive(1);
        Assert.assertTrue("Invalid isNegative test", result);
    }

}
