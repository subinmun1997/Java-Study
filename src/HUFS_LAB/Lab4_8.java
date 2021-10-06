package HUFS_LAB;
import java.util.Scanner;

public class Lab4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int ascii = scanner.nextInt();

        System.out.println("The character for ASCII code " + ascii + " is " + (char)ascii);

    }
}
