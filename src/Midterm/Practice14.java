package Midterm;
import java.util.Scanner;

public class Practice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b>c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a>b) {
            int temp = a;
            a = b;
            b = temp;
        }
        System.out.println("The integers in non-decresing order: " + a + b + c);
    }
}
