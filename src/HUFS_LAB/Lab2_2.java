package HUFS_LAB;
import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        final double PI = 3.141592;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        int length = scanner.nextInt();

        double area = radius * radius * PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);

    }
}
