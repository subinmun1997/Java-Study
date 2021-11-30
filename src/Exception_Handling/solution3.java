package Exception_Handling;

import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int quot = a / b;
            System.out.println("The quotient is " + quot);
        } catch (ArithmeticException e) {
            System.out.println("0 not allowed as 2nd input");
        }
    }
}
