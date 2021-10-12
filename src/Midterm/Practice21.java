package Midterm;
import java.util.Scanner;

public class Practice21 {
    public static void main(String[] args) {
        final double radius = 6371.01;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);

        double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println("The distance between the two points is " + d);
    }
}
