package test;

public class Q2 {
    public static String reduce(String s){
        if(s.length() == 1){
            return s;
        }
        else{
            if(s.charAt(0) != s.charAt(1))
                return s.charAt(0) + reduce(s.substring(1));
            else{
                return reduce(s.substring(1));
            }
        }
    }

}
