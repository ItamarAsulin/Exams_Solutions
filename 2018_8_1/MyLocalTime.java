package test;

public class MyLocalTime {
    private String cityName;
    private int inComparisonToUTC;
    private Clock hour;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getInComparisonToUTC() {
        return inComparisonToUTC;
    }

    public void setInComparisonToUTC(int inComparisonToUTC) {
        this.inComparisonToUTC = inComparisonToUTC;
    }

    public Clock getHour() {
        return hour;
    }

    public void setHour(Clock hour) {
        this.hour = hour;
    }

    public MyLocalTime(String cityName, int inComparisonToUTC, Clock hour){
        this.cityName = cityName;
        if(inComparisonToUTC>12 || inComparisonToUTC < -12){
            System.err.println("Illegal input. Comparison can only be between -12 - +12. set to zero by default");
            this.inComparisonToUTC = 0;
        }
        else{
            this.inComparisonToUTC = inComparisonToUTC;
        }
        this.hour = hour;
    }

    public MyLocalTime(MyLocalTime other){
        this.cityName = other.cityName;
        this.inComparisonToUTC = other.inComparisonToUTC;
        this.hour = new Clock(other.hour);
    }

    public String toString(){
        return "City Name: " + this.cityName + "\n"
                + "Time In Comparison To UTC is: " + this.inComparisonToUTC + "\n"
                +"The Time is: " + hour.toString();
    }

    public boolean equals(MyLocalTime other){
        boolean isSameCity = this.cityName == other.cityName;
        boolean isSameComparisonToUTC = this.inComparisonToUTC == other.inComparisonToUTC;
        boolean isSameHour = this.hour.getHours() == other.hour.getHours() && this.hour.getMinutes() == other.hour.getMinutes();
        if(isSameCity && isSameComparisonToUTC && isSameHour)
            return true;
        else{
            return false;
        }
    }

}
