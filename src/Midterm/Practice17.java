package Midterm;
import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double w = scanner.nextDouble();

        if (w <= 1)
            System.out.println("The shipping cost is $3.5");
        else if (w <= 3)
            System.out.println("The shipping cost is $5.5");
        else if (w <= 10)
            System.out.println("The shipping cost is $8.5");
        else if (w <= 20)
            System.out.println("The shipping cost is $10.5");
        else
            System.out.println("The package cannot be shipped");

    }
}
