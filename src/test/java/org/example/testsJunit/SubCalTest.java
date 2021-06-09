package org.example.testsJunit;


import org.junit.Assert;
import org.junit.Test;

public class SubCalTest extends BaseTestJunit{

    @Test
    public void minusTest() throws Exception {
        long result = calculator.sub(23, 10);
        Assert.assertEquals("Invalid result of sub operation!",13,result);
    }

}
