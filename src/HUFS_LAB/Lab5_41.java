package HUFS_LAB;
import java.util.Scanner;

public class Lab5_41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int max = scanner.nextInt();
        int count = 1;
        int number;
        number = scanner.nextInt();

        while (number > 0) {
            number = scanner.nextInt();
            if (number > max) {
                max = number;
                count = 1;
            }
            if (number == max)
                count++;
        }

        System.out.println("The largest number is " + max);
        System.out.println(
                "The occurrence count of the largest number is " + count);
    }
}
