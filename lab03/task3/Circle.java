public class Circle {
    private double x;
    private double y;
    private double rad;

    public Circle(double x, double y, double rad){
        if(rad < 0){
            throw new IllegalArgumentException("Gotta stay positive, man!");
        }

        this.x   = x;
        this.y   = y;
        this.rad = rad;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.rad, 2);
    }
}
