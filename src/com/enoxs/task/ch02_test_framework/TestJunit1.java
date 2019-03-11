package com.enoxs.task.ch02_test_framework;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Task#2-2-1
 * JUnit - Test Framework
 * Test Suites
 */

public class TestJunit1 {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
