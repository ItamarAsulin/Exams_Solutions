package Test;

public class Point {

    private double xVal;
    private double yVal;

    public double getxVal() {
        return xVal;
    }

    public double getyVal() {
        return yVal;
    }

    public Point(double x, double y) {
        xVal = x;
        yVal = y;
    }

    public Point(Point p) {
        xVal = p.xVal;
        yVal = p.yVal;
    }

    public double distance(Point p) {
        double xDis = xVal - p.xVal;
        double yDis = yVal - p.yVal;
        return Math.sqrt(xDis * xDis + yDis * yDis);
    }

    public boolean equals(Point p) {
        return xVal == p.xVal && yVal == p.yVal;
    }
}
