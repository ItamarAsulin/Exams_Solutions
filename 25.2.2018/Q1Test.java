package test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @org.junit.jupiter.api.Test
    void marsennePrimeTest() {
        int a = 7;
        int b = 127;
        assertTrue(Q1.MarsennePrime(a));
        assertTrue(Q1.MarsennePrime(b));
        int c = 15;
        assertFalse(Q1.MarsennePrime(c));
    }
}