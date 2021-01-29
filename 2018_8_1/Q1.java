package test;

public class Q1 {
    public static boolean countExactly(int num, int digit, int count) {

        String number = "" + num;
        String digitToAppear = "" + digit;
        if(count == 0){
            return true;
        }
        else{

            for (int i = 0; i <number.length() ; i++) {
                String numberSubString = "";
                if(digitToAppear.charAt(0) == number.charAt(i)) {
                    if(i == number.length() -1 && count ==1){
                        return true;
                    }
                    else if (i == number.length()-1 && count > 1){
                        return false;
                    }else {
                        numberSubString = number.substring(i + 1);
                        return countExactly(Integer.parseInt(numberSubString), Integer.parseInt(digitToAppear), count - 1);
                    }
                }
            }
            return false;
        }
    }
}
