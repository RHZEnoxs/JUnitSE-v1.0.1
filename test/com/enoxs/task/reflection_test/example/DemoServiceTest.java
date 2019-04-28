package com.enoxs.task.reflection_test.example;

import com.enoxs.task.reflection_test.agency.DemoServiceAgency;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class DemoServiceTest {
    DemoServiceAgency demoService;
    @Before
    public void setUp() throws Exception {
        demoService = new DemoServiceAgency();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPublicMethodTrue() {
        Boolean isActual = demoService.isPublicMethodTrue();
        assertTrue(isActual);
    }

    @Test
    public void calSum() {
        Integer num1 = 12;
        Integer num2 = 15;
        Integer expect  = 27;
        Integer actual ;
        actual = demoService.calSum(num1,num2);
        assertEquals(expect,actual);
    }

    @Test
    public void isEmpty() {
        List<Object> lstNum = Arrays.asList(1,3,5,7,9);
        assertFalse(demoService.isEmpty(lstNum));
    }

    @Test
    public void isProtectedMethodTrue() {
        assertTrue(demoService.isProtectedMethodTrue());
    }

    @Test
    public void isPrivateMethodTrue(){
        assertTrue(demoService.isPrivateMethodTrue());
    }

    @Test
    public void isPrivateMethodWithParameter(){
        Boolean isActual = null;
        try {
            isActual = demoService.isPrivateMethodWithParameter("OwO",100,true);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assertTrue(isActual);
    }
}