package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class DivCalTestDouble extends BaseTestJunit{


    @Test
    public void divTestDouble() throws Exception {
        double result = calculator.div(4.4, 2.2);
        Assert.assertEquals("Invalid result of div operation!",2,result, 0);
    }



}
