package HUFS_LAB;

public class Lab5_12 {
    public static void main(String[] args) {
        int n = 1;
        while(true) {
            if(Math.pow(n,2) > 12000)
                break;
            n++;
        }
        System.out.println("n is " + n);
    }
}
