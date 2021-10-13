package Midterm;

public class Practice31 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s    |    %10s%10s\n", "Kilograms", "Pounds", "Pounds", "Kilograms");

        int count;
        int i = 1, p = 20;
        for(count=1;count<=100;count++) {
            System.out.printf("%10d%10.1f    |    %10d%10.2f\n", i,i*2.2,p,p/2.2);
            i += 2;
            p += 5;
        }
    }
}
