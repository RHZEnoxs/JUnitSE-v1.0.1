package com.enoxs.task.using_assertion;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Task#6 - 2
 * JUnit - Using Assertion
 * Annotation
 */

public class TestRunner2 {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitAnnotation.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
