package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class MultCalTestDouble extends BaseTestJunit{


    @Test
    public void multTestDouble() throws Exception {
        double result = calculator.mult(2.5, 2.5);
        Assert.assertEquals("Invalid result of mult operation!",6.25,result,2);
    }

}
