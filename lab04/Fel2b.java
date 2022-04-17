class Fel2b{
    public static void main(String[] args) {

        System.out.print("No. of point: ");
        int n = Integer.parseInt(System.console().readLine());
        Point[] points = new Point[n];
        for(int i = 0; i < points.length;++i){
            System.out.print("Please input x :");
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Please input y :");
            double y = Double.parseDouble(System.console().readLine());
            points[i] = new Point(x, y);
        }

        System.out.println("Center of mass amount read points: " + Point.centerOfMass(points));
    }
}