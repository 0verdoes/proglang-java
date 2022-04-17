public class Fel2a {
    public static void main(String[] args) {

        Point[] points = new Point[3];
        for(int i = 0; i < points.length;++i){
            System.out.print("Please input x :");
            double x = Double.parseDouble(System.console().readLine());
            System.out.print("Please input y :");
            double y = Double.parseDouble(System.console().readLine());
            points[i] = new Point(x, y);
        }

        double avg_x = 0;
        double avg_y = 0;
        for(int i = 0; i < points.length;++i){
            avg_x += points[i].getX();
            avg_y += points[i].getY();
        }

        avg_x /= points.length;
        avg_y /= points.length;

        System.out.println("Center of mass amount read points: " + new Point(avg_x, avg_y).toString());
    }
}
