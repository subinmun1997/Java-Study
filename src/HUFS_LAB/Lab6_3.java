package HUFS_LAB;
import java.util.Scanner;

public class Lab6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = scanner.nextInt();
        if (isPaindrome(num))
            System.out.println(num + " is a palindrome");
        else
            System.out.println(num + " is not a palindrome");
    }
    public static int reverse(int number) {
        String s1 = "";
        String con = number + "";
        int i;
        for(i=con.length()-1;i>=0;i--) {
            s1 += con.charAt(i);
        }
        return Integer.parseInt(s1);
    }
    public static boolean isPaindrome(int number) {
        if (number == reverse(number))
            return true;
        else
            return false;
    }
}
