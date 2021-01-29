package test;

import static org.junit.jupiter.api.Assertions.*;
import test.Q1;
class Q1Test {

    @org.junit.jupiter.api.Test
    void sphenicTest() {
        int a = 31;
        assertTrue(Q1.sphenic(a));
    }
}