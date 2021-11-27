package Object_Classes;
import java.util.*;

public class solution12 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

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

        cars.clear();
        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        cars.size();
        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        Collections.sort(cars);
        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        for(int i=0;i<cars.size();i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();
    }
}
