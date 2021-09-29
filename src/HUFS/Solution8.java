package HUFS;
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number%2==0 && number%3==0) {
            System.out.println("number divided by 2 and 3");
        } else if (number%2==0 || number%3==0) {
            System.out.println("number divided by 2 or 3");
        } else {
            System.out.println("number not divided by 2 and 3");
        }
    }
}
