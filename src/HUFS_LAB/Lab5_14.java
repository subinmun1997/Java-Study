package HUFS_LAB;
import java.util.Scanner;

public class Lab5_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int d = (num1 < num2) ? num1 : num2;
        for (; d >= 1; d--) {
            if ((num1 % d == 0) && (num2 % d == 0)) {
                break;
            }
        }
        System.out.println("gcd is " + d);
    }
}
