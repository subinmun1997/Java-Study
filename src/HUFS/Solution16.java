package HUFS;

import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x, y: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int z = max(x,y);
        System.out.println("Max is " + z);
    }
    public static int max(int num1, int num2) {
        int result;
        if(num1>num2)
            result = num1;
        else
            result = num2;
        return result;
    }
}
