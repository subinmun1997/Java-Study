package Midterm;
import java.util.Scanner;

public class Practice26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        System.out.print("Enter a month: ");
        String month = scanner.next();

        boolean leafyear = (year%4==0 && year%100!=0) || (year%400==0);

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") || month.equals("Aug") ||
                month.equals("Oct") || month.equals("Dec"))
            System.out.println(month + " " + year + " has 31 days");
        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Jan") || month.equals("Sep") || month.equals("Nov"))
            System.out.println(month + " " + year + " has 30 days");
        else
            System.out.println(month + year + " has " + (leafyear ? 29 : 28) + " days");
    }
}
