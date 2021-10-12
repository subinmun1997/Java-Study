package Midterm;
import java.util.Scanner;

public class Practice28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = scanner.next();

        System.out.print("Enter string s2: ");
        String s2 = scanner.next();

        boolean b = s1.contains(s2);

        if (b)
            System.out.println(s2 + " is a substring of " + s1);
        else
            System.out.println(s2 + " is not a substring of " + s1);
    }
}
