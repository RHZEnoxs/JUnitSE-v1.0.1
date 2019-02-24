package com.enoxs.task.api;
import junit.framework.*;
/**
 * Task#4 - 4
 * JUnit - API
 * TestSuite (測試組合) - A TestSuite is a composite of tests.
 */
public class JunitTestSuite {
    public static void main(String[] a) {
        // add the test's in the suite
        TestSuite suite = new TestSuite(TestJunit1.class, TestJunit2.class, TestJunit3.class );
        TestResult result = new TestResult();
        suite.run(result);
        System.out.println("Number of test cases = " + result.runCount());
    }
}
