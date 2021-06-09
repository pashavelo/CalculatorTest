package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class SinCalTest extends BaseTestJunit{


    @Test
    public void SinCalTest() throws Exception {
        double result = calculator.sin(60);
        Assert.assertEquals("Invalid result of div operation!",0.8660,result, 0);
    }


}
