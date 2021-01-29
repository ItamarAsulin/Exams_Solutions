package test;

import java.util.Vector;

public class Q1 {
    public static boolean semi(int n) {
        int[] allPrimeDividers = allPrimeDividers(n);
        if (allPrimeDividers.length > 2) {
            return false;
        }
        else if (allPrimeDividers.length == 1 && !isPrime(n)) {
            return allPrimeDividers[0] * allPrimeDividers[0] == n;
        }
        else if(allPrimeDividers.length == 0){
            return false;

        }else {
            if (allPrimeDividers[0] * allPrimeDividers[1] == n)
                return true;
        }
        return false;
    }


        public static int[] allPrimeDividers ( int a){
            Vector<Integer> allPrime = new Vector<>();
            for (int i = 2; i < a / 2 + 1; i++) {
                if (a % i == 0 && isPrime(i))
                    allPrime.add(i);
            }
            int[] allPrimeDividers = new int[allPrime.size()];
            for (int i = 0; i < allPrime.size(); i++) {
                allPrimeDividers[i] = allPrime.get(i);
            }
            return allPrimeDividers;
        }


        public static boolean isPrime ( int a){
            for (int i = 2; i < a / 2 + 1; i++) {
                if (a % i == 0)
                    return false;
            }
            return true;
        }
    }


