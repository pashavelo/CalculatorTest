package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class CtgCalTest extends BaseTestJunit{


    @Test
    public void CtgCalTest() throws Exception {
        double result = calculator.ctg(60);
        Assert.assertEquals("Invalid result of div operation!",0.5774,result, 0);
    }


}
