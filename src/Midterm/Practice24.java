package Midterm;
import java.util.Scanner;

public class Practice24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char grade = scanner.next().charAt(0);

        switch (Character.toUpperCase(grade)) {
            case 'A':
                System.out.println("The numeric value for grade " + grade + " is " + 4);
                break;
            case 'B':
                System.out.println("The numeric value for grade " + grade + " is " + 3);
                break;
            case 'C':
                System.out.println("The numeric value for grade " + grade + " is " + 2);
                break;
            case 'D':
                System.out.println("The numeric value for grade " + grade + " is " + 1);
                break;
            case 'F':
                System.out.println("The numeric value for grade " + grade + " is " + 0);
                break;
            default:
                System.out.println(grade + " is an invalid grade");

        }

    }
}
