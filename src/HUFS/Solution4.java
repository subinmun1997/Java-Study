package HUFS;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if(num%5==0) {
            System.out.println("HiFive");
        }
        else if(num%2==0) {
            System.out.println("HiEven");
        }
    }
}
