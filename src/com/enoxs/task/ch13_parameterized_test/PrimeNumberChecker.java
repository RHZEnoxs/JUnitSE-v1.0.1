package com.enoxs.task.parameterized_test;

/**
 * Task#13
 * JUnit - Parameterized Test
 */
public class PrimeNumberChecker {

    public Boolean isSmallThanFive(final Integer number) {
        /*for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }*/
        if(number < 5){
            return true;
        }
        return false;
    }

}
