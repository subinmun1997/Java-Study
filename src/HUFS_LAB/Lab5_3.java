package HUFS_LAB;

public class Lab5_3 {
    public static void main(String[] args) {
        System.out.printf("%-14s%-10s\n", "Kilograms","Pounds");

        int i;
        for(i=1;i<200;i+=2) {
            System.out.printf("%-14d%-10.1f\n", i, i*2.2);
        }
    }
}
