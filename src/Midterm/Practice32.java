package Midterm;
import java.util.Scanner;

public class Practice32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String highestName = "";
        int highestScore = 0;
        System.out.print("Enter the number of students: ");
        int student = scanner.nextInt();

        for(int i=0;i<student;i++) {
            System.out.print("name: ");
            String name = scanner.next();

            System.out.print("score: ");
            int score = scanner.nextInt();

            if (score > highestScore) {
                highestName = name;
                highestScore = score;
            }
        }

        System.out.println("Highest score: " + highestScore);
        System.out.println("Highest score student: " + highestName);

    }
}
