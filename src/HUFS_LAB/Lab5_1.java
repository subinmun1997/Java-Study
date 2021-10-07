package HUFS_LAB;
import java.util.Scanner;

public class Lab5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int positive=0, negative=0;
        double total=0.0, average=0.0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        while(true) {
            int num = scanner.nextInt();
            if(num==0)
                break;
            if(num>0)
                positive++;
            else
                negative++;
            total += num;
        }
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The total is " + total);
        System.out.println("The average is " + total / (positive+negative));
    }
}
