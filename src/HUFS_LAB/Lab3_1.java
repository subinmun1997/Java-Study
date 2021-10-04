package HUFS_LAB;
import java.util.Scanner;

public class Lab3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c : ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double crim = Math.pow(b,2) - 4*a*c;

        if (crim > 0) {
            double r1 = ((-1) * b + Math.pow(b*b-4*a*c, 0.5)) / 2*a;
            double r2 = ((-1) * b - Math.pow(b*b-4*a*c, 0.5)) / 2*a;
            System.out.println("The equation has two roots " + r1 + "and" + r2);
        } else if (crim == 0) {
            double r1 = ((-1) * b + Math.pow(b*b-4*a*c, 0.5)) / 2*a;
            System.out.println("The equation has one root " + r1 );
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
