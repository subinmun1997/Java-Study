package Arrays;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class solution10 {
    public static void main(String[] args) {
        double[] numbers = {6.0,4.4,1.9,2.9,3.4,3.5};
        sort(numbers);
        System.out.println(numbers[0]);

        char[] chars = {'a','A','4','F','D','P'};
        sort(chars);
        System.out.println(chars[0]);
    }
}
