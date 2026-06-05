package com.pack3;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class Assertfalse {

    @Test
    public void test1() {

        System.out.println("Test Started");

        int a = 10;
        int b = 5;

        assertFalse(a < b);

        System.out.println("Test Passed");
    }

}