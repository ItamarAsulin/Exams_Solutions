package test;

public class Q3 {
    public static boolean diagonal(int[][] a) {
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                if (a[i][j] != a[i + 1][j + 1])
                    return false;
            }

        }
        return true;
    }
}
