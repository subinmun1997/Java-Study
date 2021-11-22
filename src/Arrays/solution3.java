package Arrays;
import java.util.Scanner;

public class solution3 {
    public static void main(String[] args) {
        // Initializing arrays with input values
        Scanner scanner = new Scanner(System.in);
        double[] myList = new double[5];
        System.out.print("Enter " + myList.length + " values: ");
        for(int i=0;i<myList.length;i++) {
            myList[i] = scanner.nextDouble();
        }
        // Printing arrays
        for(int i=0;i<myList.length;i++) {
            System.out.print(myList[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for(int i=0;i<myList.length;i++) {
            total += myList[i];
        }
        System.out.println("total: " + total);
        // Finding the largest element
        double max = myList[0];
        for(int i=1;i<myList.length;i++) {
            if(max < myList[i]) {
                max = myList[i];
            }
        }
        System.out.println("max: " + max);
    }
}
