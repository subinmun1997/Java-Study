package Midterm;
import java.util.Scanner;

public class Practice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double d = (b * b) - (4 * a * c);

        if (d > 0) {
            double r1 = ((-1) * b + Math.pow(d, 0.5)) / 2 * a;
            double r2 = ((-1) * b - Math.pow(d, 0.5)) / 2 * a;
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (d == 0) {
            double r1 = ((-1) * b + Math.pow(d, 0.5)) / 2 * a;
            System.out.println("The equation has one root " + r1);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
