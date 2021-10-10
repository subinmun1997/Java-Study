package Midterm;
import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value of feet: ");
        double feet = scanner.nextDouble();

        System.out.println(feet + " feet is " + feet * 0.305 + " meters");
    }
}
