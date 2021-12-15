package FinalStudy;
import java.util.*;

public class solution16 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");

        cars.set(0, "hyundai");
        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        cars.remove(0);
        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        Collections.sort(cars);
        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        cars.clear();
        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();
    }
}
