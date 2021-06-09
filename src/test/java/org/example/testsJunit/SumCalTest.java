package org.example.testsJunit;


import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

public class SumCalTest extends BaseTestJunit{


    @Test
    public void plusTest() throws Exception {
        long result = calculator.sum(1, 2);
        Assert.assertEquals("Invalid result of sum operation!",3,result);
    }



}
