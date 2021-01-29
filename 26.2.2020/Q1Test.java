package test;
import test.Q1.*;
import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @org.junit.jupiter.api.Test
    void semiTest() {
        int a =4;
        int b = 5;
        int c = 6;
        int d = 15;
        assertTrue(Q1.semi(a));
        assertTrue(Q1.semi(c));
        assertTrue(Q1.semi(d));
        assertFalse(Q1.semi(b));
        System.out.println((int) '0');
        System.out.println((int) '9');
    }
}