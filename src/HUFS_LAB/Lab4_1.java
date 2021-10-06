package HUFS_LAB;
import java.util.Scanner;

public class Lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double vertex = scanner.nextDouble();

        double s = 2 * vertex * Math.sin(Math.PI / 5);
        double area = 5 * Math.pow(s,2) / (4 * Math.tan(Math.PI/5));
        System.out.println("The area of the pentagon is " + area);
    }
}
