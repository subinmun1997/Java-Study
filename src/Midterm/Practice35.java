package Midterm;

public class Practice35 {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            if (Math.pow(n, 2) > 12000)
                break;
            else
                n++;
        }
        System.out.println("n is : " + n);
    }
}
