package HUFS_LAB;
import java.util.Scanner;

public class Lab4_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char letter = scanner.nextLine().charAt(0);

        switch (Character.toUpperCase(letter)) {
            case 'A':
                System.out.println("The numeric value for grade " + letter + " is " + 4);
                break;
            case 'B':
                System.out.println("The numeric value for grade " + letter + " is " + 3);
                break;
            case 'C':
                System.out.println("The numeric value for grade " + letter + " is " + 2);
                break;
            case 'D':
                System.out.println("The numeric value for grade " + letter + " is " + 1);
                break;
            case 'F':
                System.out.println("The numeric value for grade " + letter + " is " + 0);
                break;
            default:
                System.out.println(letter + " is an invalid grade");
        }
    }
}
