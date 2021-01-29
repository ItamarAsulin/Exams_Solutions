package Test;

public class Q3 {
    public static void main(String[] args) {
        int [][] a = {{1,2,3,4},{5,6,7},{8,9,10,11,12},{13,14,15,16},{17,18,19}};
        int [][] b = {{17,18,19},{13,14,15,1},{8,9,10,11,12},{5,6,7},{1,2,3,4}};
        boolean test = symmetric(a,b);
        System.out.println(test);
    }
    public static boolean symmetric(int[][] a, int[][] b){
        if(a.length != b.length)
            return false;
        else if(!symetricCellsX(a,b)){
            if(symetricCellsY(a,b)){
                return symetricY(a,b);
            }
            else{
                return false;
            }
        }
        else{ if (!symetricCellsY(a,b)){
            if(!symetricCellsX(a,b))
                return false;
            else{
                return symetricX(a,b);
            }
        }
        }
        return false;
    }
    public static boolean symetricX(int [][] a, int[][] b){
        boolean isSymetricX = true;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] != b[a.length -1 -i][j])
                    return false;
            }
        }
        return true;
    }
    public static boolean symetricY(int [][] a, int[][] b){
        boolean isSymetricY = true;
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] != b[i][a[i].length -1 -i])
                    return false;
            }
        }
        return true;
    }

    public static boolean symetricCellsX(int [][] a, int[][] b){
        boolean isSymetricCellsX = true;
        for (int i = 0; i <a.length ; i++) {
            if(a[i].length != b[a.length - 1-i].length)
                isSymetricCellsX = false;
        }
        return isSymetricCellsX;
    }
    public static boolean symetricCellsY(int [][] a, int[][] b){
        boolean isStmetricCellsY = true;
        for (int i = 0; i < a.length; i++) {
            if(a[i].length != b[i].length)
                isStmetricCellsY = false;
        }
        return isStmetricCellsY;
    }
}
