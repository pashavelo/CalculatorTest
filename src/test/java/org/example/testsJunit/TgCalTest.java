package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class TgCalTest extends BaseTestJunit{


    @Test
    public void TgCalTest() throws Exception {
        double result = calculator.tg(60);
        Assert.assertEquals("Invalid result of div operation!",1.7321,result, 0);
    }


}
