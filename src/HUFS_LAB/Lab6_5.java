package HUFS_LAB;
import java.util.Scanner;

public class Lab6_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double tmp = 0.0;
        if (num1 < num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        if (num2 < num3) {
            tmp = num2;
            num2 = num3;
            num3 = tmp;
        }
        if (num1 < num2) {
            tmp = num1;
            num1 = num2;
            num2 = tmp;
        }
        System.out.println(num3+" "+num2+" "+num1);
    }
}
