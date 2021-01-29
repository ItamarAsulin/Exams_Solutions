package test;

import java.util.Vector;

public class Q2 {
    public static String single(String s) {
        String output = "";

        for (int i = 0; i < s.length(); i++) {
            if (isSingle(s,s.charAt(i)))
                output += s.charAt(i);
        }
        return output;
    }

    public static boolean isSingle(String s, char a) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (a == s.charAt(i))
                count++;
        }
        if (count == 1) {
            return true;
        } else {
            return false;
        }
    }
}
