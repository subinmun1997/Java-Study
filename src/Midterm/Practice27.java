package Midterm;
import java.util.Scanner;

public class Practice27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String user = scanner.nextLine();

        System.out.println("length is " + user.length());
        System.out.println("first character is " + user.charAt(0));
    }
}
