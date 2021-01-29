package Test;

import java.util.Vector;

public class Q1 {
    public static void main(String[] args) {
        int a = 3445;
        boolean test = square(a);
        System.out.println(test);
    }
    public static boolean square(int a) {
        int[] dividers = allDividers(a);
        double sumOfDividersPow = sumOfDividersPow(dividers);
        int dividersInt = (int) Math.sqrt(sumOfDividersPow);
        if(dividersInt == Math.sqrt(sumOfDividersPow)){
            return true;
        }
        else{
            return false;
        }

    }

    public static int[] allDividers(int a) {
        Vector<Integer> dividers = new Vector<>();
        for (int i = 1; i < (a / 2) +1; i++) {
            if (a % i == 0) {
                dividers.add(i);
            }
        }
        dividers.add(a);
        int[] arr = new int[dividers.size()];
        for (int i = 0; i < dividers.size(); i++) {
            arr[i] = dividers.get(i);
        }
        return arr;
    }

    public static double sumOfDividersPow(int[] a) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i] * a[i];
        }
        return sum;
    }
}
