package HUFS_LAB;
import java.util.Scanner;

public class Lab6_26 {
    public static void main(String[] args) {

        int cnt=0,i;
        for (i=0;cnt<100;i++) {

            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf("%d ", i);
                cnt++;
                if (cnt % 10 == 0 && i != 0)
                    System.out.println();
            }
        }
    }
    public static boolean isPrime(long n) {
        if (n<2)
            return false;
        for (int i=2;i<=n/2;i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int reverse(int number) {
        int rev = 0;
        while (number != 0) {
            rev *= 10;
            rev += number % 10;
            number /= 10;
        }
        return rev;
    }
    public static boolean isPalindrome(int number) {
        return (number==reverse(number));
    }
}