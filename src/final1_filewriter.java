import java.util.*;
import java.io.*;

public class final1_filewriter {
    public static void main(String[] args) {
        File file = new File("final.txt");
        //Scanner input = null;
        PrintWriter output = null;
        try {
            output = new PrintWriter(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        output.println("1 LEE ICE");
        output.println("2 Park CES");
        output.println("3 John ICE");
        output.println("4 Steve CES");
        output.println("5 Kim ICE");


        output.close();

    }
}
