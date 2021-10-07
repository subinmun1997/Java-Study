package HUFS_LAB;

public class Lab5_5 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s    |    %10s%10s\n", "Kilograms","Pounds","Pounds","Kilograms");

        int count;
        int kilo = 1, pound = 20;
        for(count=1;count<=100;count++) {
            System.out.printf("%10d%10.1f    |    %10d%10.2f\n",kilo,kilo*2.2,pound,pound/2.2);
            kilo += 2;
            pound += 5;
        }
    }
}
