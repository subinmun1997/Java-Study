package HUFS_LAB;
import java.util.Scanner;

public class Lab5_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int num = scanner.nextInt();

        int div = 2;
        while(num != 1) {
            if(num%div==0) {
                num /= div;
                System.out.print(div + " ");
            } else {
                div++;
            }
        }
    }
}
