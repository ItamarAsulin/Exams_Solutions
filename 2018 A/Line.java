package Test;

public class Line {
    public static void main(String[] args) {

    }
  private  int x1;
    private int y1;
    private int x2;
    private int y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Line(Line other) {
        this.x1 = other.x1;
        this.y1 = other.y1;
        this.x2 = other.x2;
        this.y2 = other.y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public double length() {
        int base = Math.abs(this.x1 - this.x2);
        int height = Math.abs(this.y1 - this.y2);
        return Math.sqrt((base * base) + (height * height));
    }

    public boolean on(int x, int y) {
        if ((x > this.x2 || x < this.x1)) {
            return false;
        }
            else{
                Line on1 = new Line(this.x1, this.y1, x, y);
                Line on2 = new Line(x, y, this.x2, this.y2);
                if (on2.length() + on1.length() == this.length())
                    return true;
                else {
                    return false;
                }
            }
        }
    }

