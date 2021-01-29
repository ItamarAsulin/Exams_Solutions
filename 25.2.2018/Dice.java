package test;
import java.util.Random;
public class Dice {
    private int sides;
    private int[] sidesNums;

    public int getSides() {
        return sides;
    }

    public int[] getSidesNums() {
        return sidesNums;
    }

    public Dice(int a){
        this.sides = a;
        this.sidesNums = new int[a];
        for (int i = 0; i < this.sidesNums.length; i++) {
            int in = (int) (Math.random() * 2 * a) + 1;
            this.sidesNums[i] = in;
        }
    }
    public Dice(Dice other){
        this.sides = other.sides;
        this.sidesNums = new int[other.sidesNums.length];
        for (int i = 0; i < this.sidesNums.length; i++) {
            this.sidesNums[i] = other.sidesNums[i];
        }
    }
    public int throwDice(){
        int sideReturn = (int) (Math.random() *this.sidesNums.length);
        return this.sidesNums[sideReturn];
    }
}
