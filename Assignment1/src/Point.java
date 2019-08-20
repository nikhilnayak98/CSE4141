public class Point {

    double x, y;

    public Point() {}

    void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    double findDistance(Point p) {
        return Math.sqrt(Math.pow((p.x - this.x), 2) + Math.pow((p.y - this.x), 2));
    }

    double slope(Point p) {
        return (p.y - this.y) / (p.x - this.x);
    }

    Point midPoint(Point p) {
        Point mPoint = new Point();
        double xMid = (this.x + p.x) / 2;
        double yMid = (this.y+ p.y) / 2;
        mPoint.setPoint(xMid, yMid);
        return mPoint;
    }

}
