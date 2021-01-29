package test;

public class Line {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    public Line(int x1, int y1, int x2, int y2){
        this.startX = x1;
        this.startY = y1;
        this.endX = x2;
        this.endY = y2;

    }
    public Line (Line other){
        this.startX = other.startX;
        this.startY = other.startY;
        this.endX = other.endX;
        this.endY = other.endY;
    }
    public double length(){
        int base = this.startX - this.endX;
        int height = this.startY- this.endY;
        double length = Math.sqrt((base * base) + (height * height));
        return length;
    }

    public boolean on(int x, int y){
        Line a = new Line(this.startX, this.startY, x, y);
        Line b = new Line(x,y, this.endX, this.endY);
        double pointDistance = a.length() + b.length();
        if(this.length() == pointDistance)
            return true;
        else{
            return false;
        }
    }

}
