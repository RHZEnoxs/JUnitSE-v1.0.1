package com.enoxs.task.parameterized_test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Task#13
 * JUnit - Parameterized Test
 */
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PrimeNumberCheckerTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
