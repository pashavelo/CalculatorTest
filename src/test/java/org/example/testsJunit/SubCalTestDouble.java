package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;

public class SubCalTestDouble extends BaseTestJunit{

    @Test
    public void minusTestDouble() throws Exception {
        double result = calculator.sub(5.5, 1.3);
        Assert.assertEquals("Invalid result of sub operation!",4.2,result, 0);
    }

}
