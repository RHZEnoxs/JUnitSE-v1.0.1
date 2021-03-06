package com.enoxs.task.ch04_api;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Task#4 - 1
 * JUnit - API
 * Assert Class (斷言) - A set of assert methods.
 */

public class TestRunner1 {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestJunit1.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
