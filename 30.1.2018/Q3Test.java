package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void symmetric() {
        int [][] a = {{1 ,2, 3, 4},{5 ,6, 7},{8 ,9 ,10 ,11 ,12},{13 ,14, 15, 16},{17 ,18, 19 }};
        int[][] b = {{17 ,18, 19 },{13 ,14, 15, 16},{8 ,9 ,10 ,11 ,12},{5 ,6, 7},{1 ,2, 3, 4}};
        assertTrue(Q3.symmetric(a,b));
        int [][] c = {{1 ,2, 3, 4},{5 ,6, 7},{8 ,9 ,10 ,11 ,12},{13 ,14, 15, 16},{17 ,18, 19 }};
        int[][] d = {{4,3,5,1}, {7,6,5}, {12,11,10,9,8}, {16,15,14,13},{19,18,17}};
        assertFalse(Q3.symmetric(c,d));
    }
}