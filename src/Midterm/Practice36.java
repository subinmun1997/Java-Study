package Midterm;
import java.util.Scanner;


public class Practice36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int d = (n1 < n2) ? n1 : n2;

        for(; d>=1; d--) {
            if((n1%d==0) && (n2%d==0))
                break;
        }
        System.out.println("gdc is " + d);
    }
}
