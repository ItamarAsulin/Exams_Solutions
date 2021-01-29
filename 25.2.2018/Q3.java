package test;

import java.util.HashSet;
import java.util.Set;

public class Q3 {
    public static boolean crossword(char[][] a, String s){
        int stringLength = s.length();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(a[i][j] == s.charAt(0)){
                    if(horizontalSearch(s, a, j, j+stringLength -1, i ))
                        return true;
                    else if(verticalSearch(s,a,i,i+stringLength -1 , j))
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean horizontalSearch(String s, char[][] a, int start, int end , int line){
        if(a[start].length -start < end -start){
            return false;
        }
        else{
            int stringPoistion = 0;
            for (int i = start; i <end  ; i++) {
                if(a[line][i] != s.charAt(stringPoistion))
                    return false;
                stringPoistion ++;
            }
            return true;
        }
    }
    public static boolean verticalSearch(String s, char[][] a, int start, int end , int column){
        if(a.length -start < end){
            return false;
        }
        else{
            int stringPoistion = 0;
            for (int i = start; i <end  ; i++) {
                if(a[i][column] != s.charAt(stringPoistion))
                    return false;
                stringPoistion ++;
            }
            return true;
        }
    }

}
