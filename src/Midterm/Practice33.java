package Midterm;
import java.util.Scanner;

public class Practice33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int student = scanner.nextInt();

        System.out.print("Enter highest score student: ");
        String s1 = scanner.next();
        System.out.print("Enter highest score: ");
        int sc1 = scanner.nextInt();

        System.out.print("Enter second-highest score student: ");
        String s2 = scanner.next();
        System.out.print("Enter second-highest score: ");
        int sc2 = scanner.nextInt();

        if (sc2 > sc1) {
            String tempName = s1;
            int tempScore = sc1;

            s1 = s2;
            sc1 = sc2;

            s2 = tempName;
            sc2 = tempScore;
        }

        for(int i=0;i<student-2;i++) {
            System.out.print("name: ");
            String name = scanner.next();
            System.out.print("score: ");
            int score = scanner.nextInt();

            if (score > sc1) {
                sc2 = sc1;
                s2 = s1;

                sc2 = score;
                s2 = name;
            }
            else if (score > sc2) {
                sc2 = score;
                s2 = name;
            }
        }
        System.out.println("highest score : " + sc1);
        System.out.println("highest score student : " + s1);
        System.out.println("second-highest score : " + sc2);
        System.out.println("second-highest score student : " + s2);

    }
}
