package Midterm;

public class Practice34 {
    public static void main(String[] args) {
        int count = 0;
        for(int i=100;i<=1000;i++) {
            if (i%5==0 && i%6==0) {
                count += 1;
                System.out.print(i + " ");

                if (count == 10) {
                    System.out.println();
                    count = 0;
                }
            }

        }
    }
}
