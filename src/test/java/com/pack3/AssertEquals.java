package com.pack3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssertEquals {

    @Test
    public void test1() {

        System.out.println("Test Started");

        int expected = 10;
        int actual = 10;

        assertEquals(expected, actual);

        System.out.println("Test Passed");
    }

}