package Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Q1Test {


   @Test
    void squareTest() {
        int test = 246;
     assertTrue(Q1.square(246));
     assertFalse(Q1.square(256));

    }
}