package com.enoxs.task.environment_setup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Task#1
 * JUnit - Environment Setup
 */

public class TestJunit {

    @Test
    public void testAdd() {
        String str = "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }
}
