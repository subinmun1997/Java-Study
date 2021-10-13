package Midterm;

public class Practice30 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Kilograms", "Pounds");

        int i;
        for(i=1;i<200;i+=2) {
            System.out.printf("%-10d%-10.1f\n",i,i*2.2);
        }
    }
}
