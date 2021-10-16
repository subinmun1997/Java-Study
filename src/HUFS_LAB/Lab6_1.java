package HUFS_LAB;

public class Lab6_1 {
    public static void main(String[] args) {
        int i, count=0;
        for(i=1;i<=100;i++) {
            int result = getPentagonalNumber(i);
            ++count;
            System.out.print(result + " ");
            if (count==10) {
                System.out.println();
                count=0;
            }
        }
    }
    public static int getPentagonalNumber(int n) {
        int value = (n * (3*n - 1)) / 2;
        return value;
    }
}
