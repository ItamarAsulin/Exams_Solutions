package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3Test {

    @Test
    void crosswordTest() {
        char[][] a = {{'a', 'w', 'x', 'r', 'e'}, {'f', 'y', 'e', 's', 'h'}, {'h', 'y', 'y', 'e', 'a'}, {'a', 'a', 'h', 't', 'r'}, {'t', 'f', 'g', 'z', 'z'}};
        assertTrue(Q3.crossword(a, "yesh"));
        assertTrue(Q3.crossword(a, "hat"));
    }
}