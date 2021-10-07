package HUFS_LAB;
import java.util.Scanner;

public class Lab5_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        System.out.print("Enter a student name: ");
        String student1 = scanner.next();

        System.out.print("Enter a student score: ");
        int score1 = scanner.nextInt();

        System.out.print("Enter a student name: ");
        String student2 = scanner.next();

        System.out.print("Enter a student score: ");
        int score2 = scanner.nextInt();

        if(score2 > score1) {
            String tempname = student1;
            int tempscore = score1;

            student1 = student2;
            score1 = score2;

            student2 = tempname;
            score2 = tempscore;
        }

        for(int i=0;i<number-2;i++) {
            System.out.print("Enter a name: ");
            String name = scanner.next();

            System.out.print("Enter a score: ");
            int score = scanner.nextInt();

            if(score > score1) {
                score2 = score1;
                student2 = student1;

                student1 = name;
                score1 = score;
            }
            else if(score > score2){
                score2 = score;
                student2 = name;
            }
        }
        System.out.println("Top two students");
        System.out.println(student1 + "'s score is " + score1);
        System.out.println(student2 + "'s score is " + score2);
    }
}
