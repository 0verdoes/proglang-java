class Point{ // "struct like" expression

    // public makes these visible and overwritable from outside this class
    private double x;
    private double y;
    //Fields for solution 2c
    private int   id;
    private static int id_cnt = 0;

    /**
     * Constructor, that initializes an instance of Point accordingly to args
     * @param x
     * @param y
     */
    public Point(double x, double y){
        this.x = x;
        this.y = y;
        this.id = ++id_cnt; //How to give unique id to every instance in 2c
    }
    /**
     * parameterless contructor
     * This inits x and y to zero as "base" value
     */
    public Point(){
        this.id = ++id_cnt; // cannot forget about this one if we want every ID to be unique
    }
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
    @Override
    public String toString(){
        //the commented stuff is the diff between 2a and 2b solutions
        return ("(" + x + ", " + y + ")" /*+ " #" + String.format("%0" + 4 + "d", this.id)*/);
    }


    public double getX(){
        return this.x;
    }
    public double getY(){
        return this.y;
    }
    //Only used in 2b and 2c
    public static Point centerOfMass(Point[] points){
        double avg_x = 0;
        double avg_y = 0;

        for(int i = 0; i < points.length;++i){
            avg_x += points[i].getX();
            avg_y += points[i].getY();
        }

        return new Point(avg_x /= points.length, avg_y /= points.length);
    }
}