package com.enoxs.task.ch08_executing_tests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Task#8
 * JUnit - Executing Tests
 * Unit Test
 */

public class TestJunit {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message,messageUtil.printMessage());
    }
}
