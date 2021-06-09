package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;

public class DivCalTest extends BaseTestJunit{


    @Test
    public void divTest() throws Exception {
        long result = calculator.div(4, 2);
        Assert.assertEquals("Invalid result of div operation!",2,result);
    }

    @Test(expected = ArithmeticException.class)
    public void divTestWithException() throws Exception {
        int i = 4/0;
    }

}
