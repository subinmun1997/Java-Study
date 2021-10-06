package HUFS_LAB;
import java.util.Locale;
import java.util.Scanner;

public class Lab4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.nextLine().charAt(0);

        if(Character.toUpperCase(letter) == 'A' || Character.toUpperCase(letter) == 'E' || Character.toUpperCase(letter) == 'I' ||
                Character.toUpperCase(letter) == 'O' || Character.toUpperCase(letter) == 'U')
            System.out.println(letter + " is a vowel");
        else if(Character.isLetter(letter))
            System.out.println(letter + " is a consonant");
        else
            System.out.println(letter + " is an invalid input");
    }
}
