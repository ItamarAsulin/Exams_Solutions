package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    void reduce() {
        String s = "aaabbccccxxxyzza";
        String test = Q2.reduce(s);
        System.out.println(test);
    }
}