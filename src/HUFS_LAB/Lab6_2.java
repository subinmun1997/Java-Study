package HUFS_LAB;
import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter digits: ");
        int digits = scanner.nextInt();
        int value = sumDigits(digits);
        System.out.println("sum digits is " + value);
    }
    public static int sumDigits(long n) {
        int sum = 0;
        sum += (n / 100);
        n %= 100;
        sum += (n / 10);
        n %= 10;
        sum += n;
        return sum;
    }
}
