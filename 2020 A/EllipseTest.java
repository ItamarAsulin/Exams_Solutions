package Test;

import org.junit.jupiter.api.Test;
import Test.Ellipse.*;
import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {

    @Test
    void whereTest() {
        Ellipse e = new Ellipse(1.0, 1.0,3.0,3.0,5.0);
        Point test = new Point(76,1);
        assertEquals(1, e.where(test));
    }

    @Test
    void testEqualsTest() {
        Ellipse e = new Ellipse(1.0, 1.0,3.0,3.0,5.0);
        Ellipse d = new Ellipse(1.0, 1.0,3.0,3.0,5.0);
        assertTrue(e.equals(d));
    }
}