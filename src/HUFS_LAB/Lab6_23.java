package HUFS_LAB;
import java.util.Scanner;

public class Lab6_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        int div = s.indexOf(",");
        String sub = s.substring(0,div);
        char c = s.charAt(div+1);

        System.out.println("The number of occurrences is " + count(sub,c));
    }
    public static int count(String str, char a) {
        int cnt = 0,i;
        for(i=0;i<str.length();i++) {
            if(a==str.charAt(i))
                cnt+=1;
        }
        return cnt;
    }
}
