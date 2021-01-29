package test;

import org.junit.jupiter.api.Test;
import test.Q3;

import java.util.Arrays;

class Q3Test {

    @Test
    void makeArrayTest() {
        String s = "2x7,6x-3,1x0";
        int [][] test = Q3.makeArray(s);
        System.out.println(Arrays.deepToString(test));
    }
}