package Midterm;
import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        int isbn = scanner.nextInt();
        int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,temp;

        d1 = isbn / 100000000;
        isbn %= 100000000;
        d2 = isbn / 10000000;
        isbn %= 10000000;
        d3 = isbn / 1000000;
        isbn %= 1000000;
        d4 = isbn / 100000;
        isbn %= 100000;
        d5 = isbn / 10000;
        isbn %= 10000;
        d6 = isbn / 1000;
        isbn %= 1000;
        d7 = isbn / 100;
        isbn %= 100;
        d8 = isbn / 10;
        isbn %= 10;
        d9 = isbn;

        d10 = (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9)%11;
        if (d10 == 10)
            System.out.println("The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9+"X");
        else
            System.out.println("The ISBN-10 number is " + d1+d2+d3+d4+d5+d6+d7+d8+d9+d10);
    }
}
