class Circle {
    public double x,y;
    public double radius;

    public void enlarge(double mult){
        this.radius *= mult;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}