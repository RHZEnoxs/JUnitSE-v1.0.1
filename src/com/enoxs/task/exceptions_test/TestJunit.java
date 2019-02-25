package com.enoxs.task.exceptions_test;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;
/**
 * Task#12
 * JUnit - Exceptions Test
 */
public class TestJunit {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message,messageUtil.salutationMessage());
    }
}
