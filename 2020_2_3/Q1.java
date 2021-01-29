package Test;

import java.util.Vector;

public class Q1 {
    public static boolean powerful(int n) {
        int[] allPrimeDividers = allPrimeDividers(n);
        if (allPrimeDividers.length == 0)
            return false;

        for (int i = 0; i < allPrimeDividers.length; i++) {
            if (n % (allPrimeDividers[i] * allPrimeDividers[i]) != 0)
                return false;
        }
        return true;
    }

    public static int[] allPrimeDividers(int a) {
        Vector<Integer> primeDividers = new Vector<>();
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0 & isPrime(i))
                primeDividers.add(i);

        }
        int[] allPrimeDvividers = new int[primeDividers.size()];
        for (int i = 0; i < primeDividers.size(); i++) {
            allPrimeDvividers[i] = primeDividers.get(i);
        }
        return allPrimeDvividers;
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i < a / 2 + 1; i++) {
            if (a % i == 0)
                return false;
        }
        return true;
    }
}
