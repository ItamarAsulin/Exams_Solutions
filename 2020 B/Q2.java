package test;

public class Q2 {
    public static int findLongestNumSequence(String s){
        String output = "";
        String sequence= "";
        char[] chars = s.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            if((int) chars[i] > 47 && (int) chars[i] < 57)
                sequence = "" + s.charAt(i);
            else{continue;}
            for (int j = i+1; j < chars.length; j++) {
                if((int) chars[j] > 47 && (int) chars[j] < 57){
                    sequence += chars[j];
                }
                else{break;}
            }
            if(sequence.length() > output.length()){
                output = sequence;
            }
            else if(output.length() == sequence.length()){
                if(Integer.parseInt(sequence) > Integer.parseInt(output)){
                    output = sequence;
                }
            }
        }
        return Integer.parseInt(output);

    }
    public static boolean validateInput(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > 47 && s.charAt(i) < 58){
                return true;
            }
        }
         return false;}
    }

