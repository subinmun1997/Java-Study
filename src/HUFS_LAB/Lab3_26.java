package HUFS_LAB;
import java.util.Scanner;

public class Lab3_26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        System.out.println("Is 10 divisible by 5 and 6? " + (num%5==0 && num%6==0));
        System.out.println("Is 10 divisible by 5 or 6? " + (num%5==0 || num%6==0));
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + (num%5==0 ^ num%6==0));
    }
}
