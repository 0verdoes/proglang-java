package circle;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Circle {
    private double x, y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x      = x;
        this.y      = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }


    static public Circle readFromFile(String fileName) throws FileNotFoundException, IOException{
        Scanner sc  = new Scanner(fileName);
        double x    = sc.nextDouble();
        double y    = sc.nextDouble();
        double rad  = sc.nextDouble();

        sc.close();
        return new Circle(x, y, rad);
    }

    static public void saveToFile(String fileName, Circle c) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        bw.write(c.getX() + "\n" + c.getY() + "\n" + c.getRadius());
    }
}
