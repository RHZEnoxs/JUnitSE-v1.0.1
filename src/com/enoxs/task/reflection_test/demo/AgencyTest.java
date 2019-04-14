package com.enoxs.task.reflection_test.demo;

import com.enoxs.task.reflection_test.agency.DemoServiceAgency;
import com.enoxs.task.reflection_test.example.DemoServiceImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AgencyTest {
    private static DemoServiceAgency demoService;
    private static DemoServiceImpl demoServiceImpl;
    @BeforeClass
    public static void beforeClass() {
        demoService = new DemoServiceAgency();
        demoServiceImpl = demoService.getDemoServiceImpl();
    }

    @Test
    public void testIsPublicMethodTrue(){
        Boolean isActual = demoServiceImpl.isPublicMethodTrue();
        assertTrue(isActual);
    }

    @Test
    public void testIsPrivateMethodTrue(){
        Boolean isActual = demoService.isPrivateMethodTrue();
        assertTrue(isActual);
    }

    @Test
    public void testIsPrivateMethodWithParameter() throws ClassNotFoundException {
        Boolean isActual = demoService.isPrivateMethodWithParameter("OwO",100,true);
        assertTrue(isActual);
    }


}
