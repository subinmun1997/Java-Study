package HUFS;
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of radius: ");
        int radius = scanner.nextInt();

        if (radius >= 0) {
            double area = radius * radius * 3.14159;
            System.out.println("The area for the circle of radius " + radius + " is " + area);
        }
        else {
            System.out.println("Negative input");
        }
    }
}
