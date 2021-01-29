package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q2Test {

    @Test
    void single() {
        String a = "abcd9cb";
        String test1 = "ad9";
        assertEquals(Q2.single(a), test1);
        String b = "abracadabra";
        assertEquals("cd", Q2.single(b));
        assertEquals("", Q2.single(""));
    }
}