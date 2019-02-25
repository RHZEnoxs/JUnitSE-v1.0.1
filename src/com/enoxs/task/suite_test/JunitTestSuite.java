package com.enoxs.task.suite_test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * Task#9
 * JUnit - Suite Test
 * Suite
 */

@RunWith(Suite.class)

@Suite.SuiteClasses({
        TestJunit1.class,
        TestJunit2.class
})
public class JunitTestSuite {
}
