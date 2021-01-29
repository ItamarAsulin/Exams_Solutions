package test;

public class Q3 {

    public static boolean symmetric(int[][] a, int[][] b){
        if(horizonaSimetry(a,b) || verticalSimetry(a,b))
            return true;
        else{
            return false;
        }
    }



    public static boolean horizonaSimetry(int[][] a, int[][] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[a.length - 1 - i].length)
                return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[a.length - 1 - i][j])
                    return false;
            }
        }
        return true;

    }
    public static boolean verticalSimetry(int [][] a, int [][]b){
        if(a.length != b.length)
            return false;
        for (int i = 0; i <a[i].length ; i++) {
            if(a[i].length != b[i].length)
            return false;
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                if(a[i][j] != b[i][a[i].length -1 -j])
                    return false;
            }
        }
        return true;
    }
}
