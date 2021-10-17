package HUFS_LAB;
import java.util.Scanner;

public class Lab6_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        System.out.println("The number of letters in the string is " + countLetters(s));

    }
    public static int countLetters(String s) {
        int letter=0, i;
        for(i=0;i<s.length();i++) {
            if(Character.isLetter(s.charAt(i))) {
                letter += 1;
            }
        }
        return letter;
    }
}
