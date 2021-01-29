package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
private static final double eps = 0.00001;
    @Test
    void length() {
        Line test = new Line(0,0,17,6);
        assertEquals(18.027766, test.length(), eps);
    }

    @Test
    void on() {
        Line test = new Line(0,0,5,5);
        assertTrue(test.on(1,1));
        assertFalse(test.on(2,1));
    }
}