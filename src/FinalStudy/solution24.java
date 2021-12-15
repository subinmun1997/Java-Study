package FinalStudy;
import java.util.*;

public class solution24 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();
        System.out.println(it.next());
    }
}
