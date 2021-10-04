package HUFS_LAB;
import java.util.Scanner;

public class Lab3_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        double weight = scanner.nextDouble();

        if (weight <= 1)
            System.out.println("The shipping cost is $3.5");
        else if (weight <= 3)
            System.out.println("The shipping cost is $5.5");
        else if (weight <= 10)
            System.out.println("The shipping cost is $8.5");
        else if (weight <= 20)
            System.out.println("The shipping cost is $10.5");
        else
            System.out.println("The package cannot be shipped");
    }
}
