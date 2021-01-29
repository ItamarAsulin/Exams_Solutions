package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void diagonalTest() {
        int[][] test = {{1,2,3,4},{5,3,2,4},{9,5,1,2}};
        assertFalse(Q3.diagonal(test));
    }
}