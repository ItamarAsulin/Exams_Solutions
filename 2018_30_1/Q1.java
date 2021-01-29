package test;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class Q1 {

    public static boolean square(int a){
        int [] dividers = alldividers(a);
        int sum = 0;
        for (int i = 0; i <dividers.length ; i++) {
            sum += Math.pow(dividers[i],2);
        }
        double sqaure = Math.sqrt(sum);
        if((int) sqaure == sqaure){
            return true;
        }
        return false;
    }





    public static int[] alldividers(int a){
        ArrayList<Integer> dividers = new ArrayList<>();
        for (int i = 1; i <a+1 ; i++) {
            if(a% i == 0){
                dividers.add(i);
            }
        }
        int[] allDvividers = new int[dividers.size()];
        for (int i = 0; i <dividers.size() ; i++) {
            allDvividers[i] = dividers.get(i);
        }
        return allDvividers;

    }

}
