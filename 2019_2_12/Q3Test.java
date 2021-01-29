package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void isMagicSquareTest() {
        int[][] a = {{2,9,4},{7,5,3},{6,1,8}};
        assertTrue(Q3.isMagicSquare(a));
        System.out.println((int) '0');
        System.out.println((int) '9');
    }
}