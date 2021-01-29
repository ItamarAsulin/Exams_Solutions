package test;

public class Q1 {
    public static boolean MarsennePrime(int n){
        if(((n + 1) % 2 )!= 0)
            return false;
        else if(!isMarsen(n)){
            return false;
        }else{
            boolean ans = isPrime(n);
            return ans;
        }
    }
    public static boolean isMarsen(int n){
        int times = 0;
        while(Math.pow(2,times) < n+2){
            if(Math.pow(2,times) == n+1)
                return true;
            times ++;
        }
        return false;
    }
    public static boolean isPrime(int a){
        for (int i = 2; i < a/2 ; i++) {
            if(a%i == 0)
                return false;
        }
        return true;
    }
}
