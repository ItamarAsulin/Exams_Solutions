package test;

import test.Q1;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @org.junit.jupiter.api.Test
    void countExactlyTest() {
        int num = 121212;
        int digit = 2;
        int count = 4;
        assertFalse(Q1.countExactly(num, digit, count));
    }
}