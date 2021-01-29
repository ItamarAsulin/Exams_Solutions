package test;

import java.util.ArrayList;

public class Q3 {
    public static int[][] makeArray(String s){
        String [] splitToCells = s.split(",");
        int[] []output = new int[splitToCells.length][];
        for (int i = 0; i <splitToCells.length ; i++) {
            int [] toAdd = new int[splitToCells[i].charAt(0) - 48];
            for (int j = 0; j < toAdd.length ; j++) {
                int add =  splitToCells[i].charAt(2) - 48;
                toAdd[j] = add ;
            }
            output[i] = toAdd;

        }
        return output;
    }
}
