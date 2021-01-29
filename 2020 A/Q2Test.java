package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    void balanced() {
        String test = "SRSR";
        assertEquals(2,Q2.balanced(test));
        test = "RSSRS";
        assertEquals(2,Q2.balanced(test));
        test = "SSSSSS";
        assertEquals(0, Q2.balanced(test));
        test = "RRRRRRRRR";
        assertEquals(0, Q2.balanced(test));
        test = "RRRRSRSRS";
        assertEquals(0,Q2.balanced(test));
    }
}