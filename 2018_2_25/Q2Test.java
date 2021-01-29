package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    void mostAppearancesTest() {
        String s = "abbacbbca";
        char a = Q2.mostAppearances(s);
        System.out.println(a);
    }
    @Test
    void moveMostTest(){
        String s = "abbacbbca";
        String test = Q2.moveMost(s);
        System.out.println(test);
    }
}