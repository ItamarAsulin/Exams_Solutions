package Test;

import org.junit.jupiter.api.Test;

class Q2Test {

    @Test
    void reduce() {
        String test = "aaabbccccxxxxyzza";
        String reduced = Q2.reduce(test);
        System.out.println(reduced);
        test = "abcde";
        reduced = Q2.reduce(test);
        System.out.println(reduced);
    }
}