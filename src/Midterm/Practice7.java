package Midterm;
import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();

        int sum = num / 100;
        num %= 100;
        sum += num / 10;
        num %= 10;
        sum += num;

        System.out.println("The sum of the digits is " + sum);
    }
}
