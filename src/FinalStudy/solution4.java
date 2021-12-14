package FinalStudy;
import java.util.Scanner;

public class solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int[] myList = new int[5];
        System.out.print("Enter " + myList.length + " values: ");
        for(int i=0;i<myList.length;i++) {
            myList[i] = scanner.nextInt();
        }
        for(int i=0;i<myList.length;i++) {
            System.out.print(myList[i] + " ");
        }
        for(int i=0;i<myList.length;i++) {
            total += myList[i];
        }
        System.out.println("total is " + total);

        int maxValue = myList[0];
        for(int i=1;i<myList.length;i++) {
            if(myList[i] > maxValue)
                maxValue = myList[i];
        }
        System.out.println("Max Value is " + maxValue);
    }
}
