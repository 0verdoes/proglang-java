package circle.utils;

//public actually has a meaning here
public class Point{ // "struct like" expression

    // public makes these visible and overwritable from outside this class
    public double x;
    public double y;

    /**
     * Constructor, that initializes an instance of Point accordingly to args
     * @param x
     * @param y
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    /**
     * parameterless contructor
     * This inits x and y to zero as "base" value
     */
    public Point(){}
    /**
     * Moves the instance of point by args
     * @param dx
     * @param dy
     */
    public void move(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    /**
     * Mirrors the instance of point to another "point" located at (cx, cy)
     * @param cx
     * @param cy
     */
    public void mirror(double cx, double cy){
        double dx = (cx -this.x) * 2;
        double dy = (cy -this.y) * 2;
        this.move(dx, dy);
    }
    /**
     * This works well, bc overloading of functions is allowed in java
     * @param p point to mirror the instance
     */
    public void mirror(Point p){
        this.mirror(p.x, p.y);
    }
    /**
     * Calculates distance between 2 Point, instance and parameter
     * @param p Point to calc distance from
     * @return distance in double
     */
    public double distance(Point p){
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y -this.y, 2));
    }

    /**
     * Utility function for testing
     * Later this will be replaced with toString()
     */
    public void print(){
        System.out.println("(" + x + ", " + y + ")");
    }
}
