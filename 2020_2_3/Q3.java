package Test;

public class Q3 {
    public static void spiral(int[][] a){

    }
    public static int[] misgeret(int [][] a){
        int [] misgeret = new int[a.length + (a[0].length-2) * 2];
        for (int i = 0; i <a.length ; i++) {
            misgeret [i] = a[0][i];
        }
        for (int i = a.length; i < a.length +3 ; i++) {
            for (int j = 1; j <a.length ; j++) {
                misgeret [i] =a[j][a.length -1];
            }

        }
        for (int i = a.length + a.length -1; i <a.length*2 +a.length-2 ; i++) {
            for (int j = a.length -2; j >=0 ; j--) {
                misgeret[i] = a[a.length-1][j];
            }
        }
        for (int i = a.length + a.length -1 + a.length -1; i < a.length*2 + 2*(a.length-2) ; i++) {
            for (int j = a.length -1; j >=1 ; j--) {
                misgeret[i] = a[j][0];

            }
        }
        return misgeret;
    }
}
