import java.util.*;
import java.io.*;

public class final2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values: ");
        while(true) {
            int sc = scanner.nextInt();
            if(sc != 0)
                list.add(sc);
            else
                break;
        }
        Integer maxValue = max(list);
        System.out.println("Max value is " + maxValue);

    }
    public static Integer max(ArrayList<Integer> list) {
        if(list.size() == 0) {
            return null;
        } else {
            Integer maximum = list.get(0);
            for(int i=1;i<list.size();i++) {
                if (maximum < list.get(i)) {
                    maximum = list.get(i);
                }
            }
            return maximum;
        }
    }
}
