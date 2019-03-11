package com.enoxs.task.ch03_basic_usage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Task#3
 * JUnit - Basic Usage
 */

public class TestJunit {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() {
        boolean isTest = false;
        if (isTest) {
            message = "New Word";
        }
        assertEquals(message, messageUtil.printMessage());
    }
}
