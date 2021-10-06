package HUFS_LAB;
import java.util.Scanner;

public class Lab4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string and displays its length and its first character: ");
        String user = scanner.nextLine();

        System.out.println("length is : " + user.length());
        System.out.println("first character is : " + user.charAt(0));
    }
}
