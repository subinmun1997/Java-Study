import java.util.*;
import java.io.*;

public class final1_filereader {
    public static void main(String[] args) {
        File file = new File("final.txt");
        Scanner input = null;

        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while(input.hasNext()) {
            String first = input.next();
            String mid = input.next();
            String last = input.next();

            System.out.println(first + " " + mid + " " + last);
        }
            input.close();
    }
    // read first line  and delete first
    // and re-write first line end line of the file ((until end of file))
    // i think this approach is reverse order
}

