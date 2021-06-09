package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class MultCalTest extends BaseTestJunit{


    @Test
    public void multTest() throws Exception {
        long result = calculator.mult(2, 2);
        Assert.assertEquals("Invalid result of mult operation!",4,result);
    }

}
