package Midterm;
import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double pound = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        double weight = pound * 0.45359237;
        double height = inches * 0.0254;

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI is " + bmi);
    }
}
