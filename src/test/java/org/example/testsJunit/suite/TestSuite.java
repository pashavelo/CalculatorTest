package org.example.testsJunit.suite;


import org.example.testsJunit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SumCalTest.class,
        SubCalTest.class,
        MultCalTest.class,
        DivCalTest.class,
})

public class TestSuite extends BaseTestJunit {

    public TestSuite() {

    }

}
