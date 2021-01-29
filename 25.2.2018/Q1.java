package test;

public class Q1 {
    public static boolean MarsennePrime(int n){
        if(MarseneNum(n) && isPrime(n)){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean MarseneNum(int n) {
        if ((n + 1) % 2 != 0) {
            return false;
        }
        for (int i = 0; i < n /2 +1; i++) {
            if (Math.pow(2, i) == (n+1))
                return true;
        }
        return false;
    }


    public static boolean isPrime(int a) {
        for (int i = 2; i < a/2 + 1; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
