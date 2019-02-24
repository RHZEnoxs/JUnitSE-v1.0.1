package com.enoxs.task.test_framework;

import junit.framework.TestCase;

/**
 * Task#2 - 1
 * JUnit - Test Framework
 * Fixtures
 */
public class JavaTest extends TestCase {
    protected int value1, value2;

    // assigning the values
    protected void setUp(){
        value1 = 3;
        value2 = 3;
    }

    // test method to add two values
    public void testAdd(){
        double result = value1 + value2;
        System.out.println(value1 + " , " + value2);
        System.out.println(result);

        assertTrue(result == 6);
    }
}
