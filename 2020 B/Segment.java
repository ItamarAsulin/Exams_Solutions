package test;

public class Segment {
    private Point endPoint1;
    private Point endPoint2;


    public Segment(Point p1, Point p2){
        if(p1.getX() < p2.getX()){
            this.endPoint1 = new Point(p1.getX(), p1.getY());
            this.endPoint2 = new Point(p2.getX(), p2.getY());
        }else{
            this.endPoint1 = new Point(p2.getX(), p2.getY());;
            this.endPoint2 = new Point(p1.getX(), p1.getY());

        }
    }
    public Segment(Segment other){
        this.endPoint1 = new Point(other.endPoint1.getX(), other.endPoint1.getY());
        this.endPoint2 = new Point(other.endPoint2.getX(), other.endPoint2.getY());
    }
    public double length(){
        double base = Math.abs(this.endPoint2.getX() - this.endPoint1.getX());
        double height = Math.abs(this.endPoint2.getY() - this.endPoint1.getY());
        double distance = Math.sqrt((base * base) + (height *height));
        return distance;
    }

    public boolean onSegment(Point p){
        if(p.getX() < this.endPoint1.getX() || p.getX() > this.endPoint2.getX())
            return false;
        Segment a = new Segment(this.endPoint1, p);
        Segment b = new Segment(p, this.endPoint2);
        if((a.length() + b.length()) == this.length())
            return true;
        else{
            return false;
        }
    }
}
