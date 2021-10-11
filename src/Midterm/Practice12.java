package Midterm;
import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        double a, b, c, d, e, f;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();

        double dimon = (a * d) - (b * c);
        if (dimon == 0)
            System.out.println("The equation has no solution");
        else {
            double x = (e*d - b*f) / dimon;
            double y = (a*f - e*c) / dimon;
            System.out.println("x is " + x + " and y is " + y);
        }
    }
}
