package Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1Test {

    @org.junit.jupiter.api.Test
    void powerfulTest() {
        int a =  72;
        assertTrue(Q1.powerful(a));
        int b = 71;
        assertFalse(Q1.powerful(b));
        System.out.println((int) 'R');
        System.out.println((int) 'S');
    }
}