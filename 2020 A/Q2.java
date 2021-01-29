package Test;

public class Q2 {
    public static int balanced(String s){
int count = 0;
String [] allSubstringKidomet  = subStringKidomet(s);
        for (int i = 1; i <allSubstringKidomet.length ; i++) {
            if(sCount(allSubstringKidomet[i]) == rCount(allSubstringKidomet[i]))
                count ++;
        }
        return count;
    }
    public static int sCount(String s){
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if((int)s.charAt(i) == 83)
                count ++;
        }
        return count;
    }
    public static int rCount(String s){
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            if((int)s.charAt(i) == 82)
                count ++;
        }
        return count;
    }
    public static String[] subStringKidomet(String s){
        String [] allSubString = new String[s.length()];
        for (int i = 0; i <s.length() ; i++) {
            allSubString[i] = s.substring(0,i +1);

        }
        return allSubString;
    }
}
