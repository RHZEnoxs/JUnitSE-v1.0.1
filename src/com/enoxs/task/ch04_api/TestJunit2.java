package com.enoxs.task.ch04_api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Task#4 - 2
 * JUnit - API
 * TestCase Class
 */
public class TestJunit2 extends TestCase {
    protected double fValue1;
    protected double fValue2;

    @Before
    public void setUp() {
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd() {
        //count the number of test cases
        System.out.println("No of Test Case = "+ this.countTestCases());

        //test getName
        String name = this.getName();
        System.out.println("Test Case Name = "+ name);

        //test setName
        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated Test Case Name = "+ newName);
        assertTrue(true);
    }

    //tearDown used to close the connection or clean up activities
    public void tearDown(  ) {
    }

}
