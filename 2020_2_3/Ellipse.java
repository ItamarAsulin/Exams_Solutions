package Test;

import java.security.PrivateKey;

public class Ellipse {
    private Point qCenter;
    private Point pCenter;
    private double n;

    public Ellipse(double Xp, double Yp, double Xq, double Yq, double n){
        this.pCenter = new Point(Xp,Yp);
        this.qCenter = new Point(Xq, Yq);
        this.n = n;
    }

    public Ellipse(Ellipse other){
        this.qCenter = new Point(other.qCenter.getxVal(), other.qCenter.getyVal());
        this.pCenter = new Point(other.pCenter.getxVal(),other.pCenter.getyVal());
        this.n = other.n;
    }

    
    public int where(Point r){
        if(r.distance(this.qCenter) + r.distance(this.pCenter) == n)
            return 0;
        if(r.distance(this.qCenter) + r.distance(this.pCenter) < n)
            return -1;
        if(r.distance(this.qCenter) + r.distance(this.pCenter) > n)
            return 1;
        else return 3;
    }
    public boolean equals(Ellipse e){
        boolean qEquals = this.qCenter.getxVal() == e.qCenter.getxVal() && this.qCenter.getyVal() == e.qCenter.getyVal();
        boolean pEquals = this.pCenter.getxVal() == e.pCenter.getxVal() && this.pCenter.getyVal() == e.pCenter.getyVal();
        boolean nEquals = this.n == e.n;
        if(qEquals && pEquals && nEquals)
            return true;
        else{
            return false;
        }
    }
}
