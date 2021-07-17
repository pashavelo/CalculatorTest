package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class CosCalTest extends BaseTestJunit{


    @Test
    public void CosCalTest() throws Exception {
        double result = calculator.cos(60);
        Assert.assertEquals("Invalid result of div operation!",0.5000,result, 0.1);
    }


}
