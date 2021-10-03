package HUFS_LAB;
import java.util.Scanner;

public class Lab2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();

        int first = number / 100;
        number %= 100;
        int second = number / 10;
        number %= 10;
        int third = number;
        int total = first + second + third;

        System.out.println("The sum of the digits is " + total);
    }
}
