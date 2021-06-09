package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class PowCalTest extends BaseTestJunit{


    @Test
    public void powTest() throws Exception {
        double result = calculator.pow(2, 4);
        Assert.assertEquals("Invalid result of pow operation!",16,result,1);
    }

}
