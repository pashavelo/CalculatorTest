package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;
public class SqrtCalTest extends BaseTestJunit{


    @Test
    public void sqrtTest() throws Exception {
        double result = calculator.sqrt(25);
        Assert.assertEquals("Invalid result of pow operation!",5,result,0);
    }

}
