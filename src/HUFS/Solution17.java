package HUFS;

public class Solution17 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(sign(num));
    }
    public static int sign(int n) {
        if(n>0)
            return 1;
        else if(n==0)
            return 0;
        else
            return -1;
    }
}
