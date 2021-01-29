package test;

import org.junit.jupiter.api.Test;
import test.Q3;
import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void horizontalTest() {
        int [][] a = {{7,10,8},{2,-3,0},{4,1,2},{5,6,6}};
        assertTrue(Q3.horizontal(a));
    }
}