package test;

public class PhoneNumber {
    private String areaCode;
    private int phoneNum;

    public PhoneNumber(String areaCode, int phoneNum){
        this.areaCode = areaCode;
        this.phoneNum = phoneNum;
    }

    public PhoneNumber(PhoneNumber other){
        this.areaCode = other.areaCode;
        this.phoneNum = other.phoneNum;
    }
    public boolean checkInput(){
        if(validateAreaCode() && validatePhoneNum()){
            return true;
        }
        else{
            return false;
        }

    }
    public boolean validatePhoneNum(){
        String s = ""+ this.phoneNum;
        char[] a = s.toCharArray();
        if(a.length >7){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if((int) a[i] < 48 || (int) a[i] > 57 )
                return false;
        }
        return true;
    }
    public boolean validateAreaCode(){
        if(this.areaCode.length() != 2)
            return false;
        else{
            for (int i = 0; i <this.areaCode.length() ; i++) {
                if((int) this.areaCode.charAt(i) < 48 || (int) this.areaCode.charAt(i) > 57 )
                    return false;
            }
            return true;
        }
    }
    public String toSting(){
        return this.areaCode + "-"+ this.phoneNum;
    }
}
