package com.enoxs.task;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class runTask {
    @Test
    public void testHelloWorld(){
        String msg = "Hello World";
        System.out.println(msg);
        assertEquals(msg,"Hello World");
    }
}
