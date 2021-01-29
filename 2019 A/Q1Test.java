package test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @org.junit.jupiter.api.Test
    void marsennePrime() {
        int a = 127;
        int b = 63;
        assertTrue(Q1.MarsennePrime(a));
        assertFalse(Q1.MarsennePrime(b));
    }
}