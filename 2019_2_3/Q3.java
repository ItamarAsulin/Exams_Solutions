package test;

public class Q3 {
    public static boolean horizontal(int[][] a) {
        if (a.length % 2 != 0)
            return false;
        else {
            for (int i = 0; i < a[0].length; i++) {
                if (upperHalf(a, i) != lowerHalf(a, i))
                    return false;
            }
            return true;
        }

    }



    public static int upperHalf(int[][] a, int j) {
        int sum = 0;
        for (int i = 0; i < a.length / 2; i++) {
            sum += a[i][j];
        }
        return sum;
    }

    public static int lowerHalf(int[][] a, int j) {
        int sum = 0;
        for (int i = a.length / 2; i < a.length; i++) {
            sum += a[i][j];
        }
        return sum;
    }
}
