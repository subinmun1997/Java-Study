package HUFS_LAB;
import java.util.Scanner;

// lab 5.8
public class Lab5_8 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int highestScore = 0;
       String highestScoreStudent = "";

       System.out.print("Enter the number of students: ");
       int student = scanner.nextInt();

       for(int i=0;i<student;i++) {
           System.out.print("name: ");
           String name = scanner.next();
           System.out.print("score: ");
           int score = scanner.nextInt();

           if(score > highestScore) {
               highestScore = score;
               highestScoreStudent = name;
           }
       }
       System.out.println("Highest Score Student is " + highestScoreStudent);
    }
}
