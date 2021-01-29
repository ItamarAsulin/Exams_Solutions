package Test;

public class Q2 {

    public static String reduce(String s){
        String output = "" ;
        for (int i = 0; i <s.length() -1; i++) {
            if(s.charAt(i) != s.charAt(i+1))
                output+= s.charAt(i);
        }
        if(s.charAt(s.length()-1) != s.charAt(s.length()-2)){
            output += s.charAt(s.length()-1);
        }
        return output;
    }
}
