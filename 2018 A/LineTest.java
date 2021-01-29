package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    public void onTest() {
        Line l1 = new Line(0, 0, 2, 0);
        assertTrue(l1.on(1, 0));
        assertFalse(l1.on(1, 1));
    }
}