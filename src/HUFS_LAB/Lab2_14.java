package HUFS_LAB;
import java.util.Scanner;

public class Lab2_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds, inches, weight, height, BMI;
        System.out.print("Enter weigth in pounds: ");
        pounds = scanner.nextDouble();
        System.out.print("Enter height in inches: ");
        inches = scanner.nextDouble();

        weight = pounds * 0.45359237;
        height = inches * 0.0254;
        BMI = weight / Math.pow(height, 2);

        System.out.println("BMI is " + BMI);
    }
}
