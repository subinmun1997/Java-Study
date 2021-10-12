package Midterm;
import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = scanner.nextInt();

        int first = number / 100;
        int third = (number%100)%10;

        if (first == third)
            System.out.println(number + " is a palindrome");
        else
            System.out.println(number + " is not a palindrome");
    }
}
