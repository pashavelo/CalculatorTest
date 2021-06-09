package org.example.testsJunit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class BaseTestJunit {

    Calculator calculator = new Calculator();

    @Before
    public void setUp(){
        calculator = new Calculator();
    }
    @After
    public void tearDown(){
        calculator = null;
    }
}
