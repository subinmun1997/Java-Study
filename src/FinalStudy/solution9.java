package FinalStudy;
import java.util.Arrays;

public class solution9 {
    public static void main(String[] args) {
        double[] numbers = {6.0,4.4,1.9,2.9,3.4,3.5};
        Arrays.sort(numbers);

        char[] chars = {'a','A','4','F','D','P'};
        Arrays.sort(chars);

        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for(int i=0;i<chars.length;i++) {
            System.out.print(chars[i] + " ");
        }

    }
}
