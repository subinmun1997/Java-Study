package Midterm;
import java.util.Scanner;

public class Practice37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer : ");
        int num = scanner.nextInt();
        int i = 2;
        while (num != 1) {
            if (num%i==0) {
                num /= i;
                System.out.print(i + " ");
            }
            else
                i++;
        }
    }
}
