package Object_Classes;

import java.util.ArrayList;
import java.util.Iterator;

public class solution32 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volve");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();
        // Print the first item
        System.out.println(it.next());
    }
}
