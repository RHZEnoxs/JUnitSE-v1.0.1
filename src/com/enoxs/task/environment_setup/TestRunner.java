package com.enoxs.task.environment_setup;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Task#1
 * JUnit - Environment Setup
 */
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
