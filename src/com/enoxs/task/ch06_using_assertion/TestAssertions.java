package com.enoxs.task.ch06_using_assertion;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Task#6 - 1
 * JUnit - Using Assertion
 * Assertion
 */

public class TestAssertions {
    @Test
    public void testAssertions() {
        //test data
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = "abc";
        String str5 = "abc";

        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = {"one", "two", "three"};
        String[] resultArray = {"one", "two", "three"};

        //Check that two objects are equal
        assertEquals(str1, str2);

        //Check that a condition is true
        assertTrue(val1 < val2);

        //Check that a condition is false
        assertFalse(val1 > val2);

        //Check that an object isn't null
        assertNotNull(str1);

        //Check that an object is null
        assertNull(str3);

        //Check if two object references point to the same object
        assertSame(str4, str5);

        //Check if two object references not point to the same object
        assertNotSame(str1, str3);

        //Check whether two arrays are equal to each other.
        assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testEquals() {
        assertEquals("OwO", "OwO");
    }


    @Test
    public void testTrue() {
        assertTrue(true);
    }

    @Test
    public void tesFalse() {
        assertFalse(false);
    }

    @Test
    public void testNull() {
        assertNull(null);
    }

    @Test
    public void testNotNull() {
        assertNotNull("OwO");
    }

    @Test
    public void testSame() {
        String str1 = "OwO";
        String str2 = "OwO";
        assertSame(str1, str2);
    }

    @Test
    public void testNotSame() {
        String str1 = new String("OwO");
        String str2 = new String("OwO");
        assertNotSame(str1, str2);
    }

    @Test
    public void testArrayEquals() {
        String[] arr1 = {"OwO", "OwO / "};
        String[] arr2 = {"OwO", "OwO / "};
        assertArrayEquals(arr1, arr2);
    }
}
