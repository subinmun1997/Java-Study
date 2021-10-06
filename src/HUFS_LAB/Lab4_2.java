package HUFS_LAB;
import java.util.Scanner;

public class Lab4_2 {
    public static void main(String[] args) {
        final double RADIUS = 6371.01;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = scanner.nextDouble();
        double long1 = scanner.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = scanner.nextDouble();
        double long2 = scanner.nextDouble();

        lat1 = Math.toRadians(lat1);
        long1 = Math.toRadians(long1);
        lat2 = Math.toRadians(lat2);
        long2 = Math.toRadians(long2);

        double d = RADIUS * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1-long2));
        System.out.println("The distance between the two points is " + d);

    }
}
