package Midterm;
import java.util.Scanner;

public class Practice19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int con = scanner.nextInt();

        if (con == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollar = scanner.nextDouble();
            double RMB = dollar * rate;
            System.out.println("$" + dollar + " is " + RMB + "yuan");
        } else if (con == 1) {
            System.out.print("Enter the RMB amount: ");
            double RMB = scanner.nextDouble();
            double dollar = RMB / rate;
            System.out.println(RMB + " yuan is $" + dollar);
        } else {
            System.out.println("Incorrect input");
        }
    }
}
