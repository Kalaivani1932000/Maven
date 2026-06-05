package com.pack3;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Asserttrue {

    @Test
    public void test1() {

        System.out.println("Test Started");

        int a = 10;
        int b = 5;

        assertTrue(a > b);

        System.out.println("Test Passed");
    }

}