package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SegmentTest {

    @Test
    void lengthTest() {
        Segment test = new Segment(new Point(0,0), new Point(3,0));
        assertEquals(3,test.length());
    }

    @Test
    void onSegmentTest() {
        Segment test = new Segment(new Point(0,0), new Point(3,0));
        Point p = new Point(2,0);
        assertTrue(test.onSegment(p));
    }
}