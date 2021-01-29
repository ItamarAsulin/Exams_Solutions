package test;

import java.util.Vector;

public class Q1 {
    public static boolean sphenic(int n) {
        int[] dividors = allDividers(n);
        int[] primeDIviders = allPrimeDividers(dividors);
        if (primeDIviders.length < 3) {
            return false;
        } else {
            for (int i = 0; i < primeDIviders.length; i++) {
                for (int j = 0; j < primeDIviders.length; j++) {
                    for (int k = 0; k < primeDIviders.length; k++) {
                        if (primeDIviders[i] * primeDIviders[j] * primeDIviders[k] == n && primeDIviders[i] != primeDIviders[j] && primeDIviders[j] != primeDIviders[k]) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }

    }


    public static int[] allDividers(int a) {
        Vector<Integer> dividers = new Vector<>();
        for (int i = 2; i < a / 2 + 1; i++) {
            if (a % i == 0) {
                dividers.add(i);
            }
        }
        int[] allDividers = new int[dividers.size()];
        for (int i = 0; i < dividers.size(); i++) {
            allDividers[i] = dividers.get(i);
        }
        return allDividers;
    }

    public static int[] allPrimeDividers(int[] a) {
        Vector<Integer> primeDividers = new Vector<>();
        for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                primeDividers.add(a[i]);
            }
        }
        int[] nPrimeDividors = new int[primeDividers.size()];
        for (int i = 0; i < nPrimeDividors.length; i++) {
            nPrimeDividors[i] = primeDividers.get(i);
        }
        return nPrimeDividors;
    }

    public static boolean isPrime(int a) {
        if(a == 2)
            return true;
        for (int i = 2; i < a / 2 + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
            return true;

    }
}
