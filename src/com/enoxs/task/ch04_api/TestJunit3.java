package com.enoxs.task.api;

import org.junit.Test;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

import static org.junit.Assert.assertTrue;

/**
 * Task#4 - 3
 * JUnit - API
 * TestResult Class
 */
public class TestJunit3 extends TestResult{
    // add the error
    public synchronized void addError(Test test, Throwable t) {
        super.addError((junit.framework.Test) test, t);
    }

    // add the failure
    public synchronized void addFailure(Test test, AssertionFailedError t) {
        super.addFailure((junit.framework.Test) test, t);
    }

    @Test
    public void testAdd() {
        // add any test
        assertTrue(true);
    }

    // Marks that the test run should stop.
    public synchronized void stop() {
        //stop the test here
    }
}
