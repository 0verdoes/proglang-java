package circle;

import circle.utils.*;

public class Circle {
    private Point center;
    private double rad;

    public Circle(double x, double y, double rad){
        if(rad < 0){
            throw new IllegalArgumentException("Gotta stay positive, man!");
        }

        this.center = new Point(x, y);
        this.rad = rad;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.rad, 2);
    }

    /**
     * This method doesn't return reference to stored object
     * Only returns a point with the same state, which leads to more secore code
     * Never give out "ergo return" object that describes your inner state!!!
     * @return copy of point in center
     */
    public Point getCenter(){
        Point copy = new Point(center.x, center.y);
        return copy;
    }
}
