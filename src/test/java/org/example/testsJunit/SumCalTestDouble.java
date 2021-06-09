package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class SumCalTestDouble extends BaseTestJunit{


    @Test
    public void plusTestDouble() throws Exception {
        double result = calculator.sum(1.5, 2.5);
        Assert.assertEquals("Invalid result of sum operation!",4, result, 0);
    }

}
