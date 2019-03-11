package com.enoxs.task.ch09_suite_test;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Task#9
 * JUnit - Suite Test
 * JUnit Test 1
 */

public class TestJunit1 {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
