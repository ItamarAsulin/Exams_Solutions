package test;

public class Q2 {
    public static String moveMost(String str){
        String output = "";
        String allCharAppearances = "";
        char mostAppeared = mostAppearances(str);
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i) != mostAppeared){
                output += str.charAt(i);
            }else{
                allCharAppearances += str.charAt(i);
            }
        }
        return output + allCharAppearances;
    }



    public static char mostAppearances(String s){
        int currentHighestCount = 0;
        char appearedMost = s.charAt(0);
        for (int i = 0; i <s.length() ; i++) {
            int count = 1;
            for (int j = 0; j <s.length() ; j++) {
                if(s.charAt(i) == s.charAt(j) && i!=j){
                    count ++;
                }
            }
            if(count > currentHighestCount){
                currentHighestCount = count;
                appearedMost = s.charAt(i);
            }
        }
        return appearedMost;
    }
}
