package com.enoxs.task.using_assertion;
import org.junit.After;
import org.junit.AfterClass;

import org.junit.Before;
import org.junit.BeforeClass;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Task#6 - 2
 * JUnit - Using Assertion
 * Annotation
 */

public class JunitAnnotation {
    //execute before class
    @BeforeClass
    public static void beforeClass() {
        System.out.println("in before class");
    }

    //execute after class
    @AfterClass
    public static void  afterClass() {
        System.out.println("in after class");
    }

    //execute before test
    @Before
    public void before() {
        System.out.println("in before");
    }

    //execute after test
    @After
    public void after() {
        System.out.println("in after");
    }

    //test case
    @Test
    public void test() {
        System.out.println("in test");
    }

    @Test
    public void testEquals() {
        System.out.println("in test");
        assertEquals("OwO", "OwO");
    }


    @Test
    public void testTrue() {
        System.out.println("in testTrue");
        assertTrue(true);
    }

    @Test
    public void tesFalse() {
        System.out.println("in tesFalse");
        assertFalse(false);
    }

    @Test
    public void testNull() {
        System.out.println("in testNull");
        assertNull(null);
    }

    @Test
    public void testNotNull() {
        System.out.println("in testNotNull");
        assertNotNull("OwO");
    }



    @Ignore
    public void ignoreTest() {
        System.out.println("in ignore test");
    }
}
