package Midterm;
import java.util.Scanner;

public class Practice29 {
    public static void main(String[] args) {
        int p=0,n=0;
        double total=0.0, average=0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        while (true) {
            int num = scanner.nextInt();
            if (num == 0)
                break;
            if (num > 0)
                p += 1;
            else
                n += 1;

            total += num;
        }
        System.out.println("The number of positives is " + p);
        System.out.println("The number of negatives is " + n);
        System.out.println("The total is " + total);
        System.out.println("The average is " + total / (p+n));
    }
}
