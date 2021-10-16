package HUFS_LAB;

public class Lab6_10 {
    public static void main(String[] args) {
        int p = 0,i;
        for (i=1;i<10000;i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                p++;
                if (p%10==0)
                    System.out.println();
            }
        }
        System.out.println("Number of primes is " + p);
    }
    public static boolean isPrime(int number) {
        int div;
        for (div=2;div<=number/2;div++) {
            if (number%div==0)
                return false;
        }
        return true;
    }
}
