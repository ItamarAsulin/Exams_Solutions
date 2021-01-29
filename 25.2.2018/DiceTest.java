package test;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void throwDiceTest() {
        Dice testDice = new Dice(15);
//        System.out.println(Arrays.toString(testDice.getSidesNums()));
        for (int i = 0; i < 10; i++) {
            System.out.println(testDice.throwDice());
        };
    }
}