package Exception_Handling;

import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        // if number2 is zero -> divide by zero (runtime error)
        System.out.println(number1 + " / " + number2 + " is " + (number1/number2));
    }
}
