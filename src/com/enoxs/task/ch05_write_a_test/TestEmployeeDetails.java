package com.enoxs.task.write_a_test;

import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * Task#5
 * JUnit - Writing a Test
 * TestEmployeeDetails
 */
public class TestEmployeeDetails {
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();

    //test to check appraisal
    @Test
    public void testCalculateAppriasal() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);
        assertEquals(500, appraisal, 0.0);
    }

    // test to check yearly salary
    @Test
    public void testCalculateYearlySalary() {
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);
        assertEquals(96000, salary, 0.0);
    }

    @Test
    public void testIsTrue(){
        assertTrue(true);
    }
    @Test
    public void testIsFalse(){
        assertFalse(false);
    }
    @Test
    public void testEquals(){
        assertEquals("OwO","OwO");
    }
}
