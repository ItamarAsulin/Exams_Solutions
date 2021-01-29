package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    void findLongestNumSequenceTest() {
        String test = "93&*ab1234crt70";
        System.out.println(Q2.findLongestNumSequence(test));
        test = "8ab(55c#r9t";
        System.out.println(Q2.findLongestNumSequence(test));
    }
}