package HUFS_LAB;
import java.util.Scanner;

public class Lab3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f: ");
        double a,b,c,d,e,f;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        e = scanner.nextDouble();
        f = scanner.nextDouble();

        if (a*d-b*c == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e*d-b*f) / (a*d-b*c);
            double y = (a*f-e*c) / (a*d-b*c);
            System.out.println("x is " + x + " y is " + y);
        }
    }
}
