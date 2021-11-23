package Multidimensional_Arrays;
import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        //Initializing arrays with input values
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                matrix[row][col] = (int)(Math.random() * 100);
            }
        }
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        int total = 0;
        for(int row=0;row<matrix.length;row++) {
            for(int col=0;col<matrix[row].length;col++) {
                total += matrix[row][col];
            }
        }
        System.out.println("total: " + total);
    }
}
