package com.enoxs.task.execution_procedure;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Task#7
 * JUnit - Execution Procedure
 */

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ExecutionProcedureJunit.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}
