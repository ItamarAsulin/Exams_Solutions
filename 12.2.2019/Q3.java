package test;

public class Q3 {
    public static boolean isMagicSquare(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            if (a.length != a[i].length)
                return false;
        }
        int sum = 0;
        for (int i = 0; i <a.length ; i++) {
            sum+= a[0][i];
        }
        if(sum != sumOfLeftDiaganol(a))
            return false;
        else if(sum != sumOfRightDiaganol(a))
            return false;

        for (int i = 0; i <a.length ; i++) {
             if(sum!= columnSum(a,i))
                return false;
            else if(sum != lineSum(a,i))
                return false;
        }
        return true;
    }

    public static boolean columnSum(int[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (columnSum(a, i) != columnSum(a, i))
                return false;
        }
        return true;
    }

    public static boolean lineSum(int[][] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (lineSum(a, i) != lineSum(a, i))
                return false;
        }
        return true;
    }

    public static boolean sumOfDiaganols(int[][] a) {
        if (sumOfLeftDiaganol(a) != sumOfRightDiaganol(a))
            return false;
        else
            return true;
    }


    public static int columnSum(int[][] a, int column) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i][column];
        }
        return sum;
    }

    public static int lineSum(int[][] a, int line) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[line][i];
        }
        return sum;
    }

    public static int sumOfLeftDiaganol(int[][] a) {
        int sum = a[0][0];
        for (int i = 1; i < a.length; i++) {
            sum += a[i][i];
        }
        return sum;
    }

    public static int sumOfRightDiaganol(int[][] a) {
        int sum = a[0][a.length - 1];
        for (int i = 1; i < a.length; i++) {
            sum+= a[i][a.length -1 -i];

        }
        return sum;
    }
}
