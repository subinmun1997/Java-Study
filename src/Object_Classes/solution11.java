package Object_Classes;
import java.util.ArrayList;
import java.util.Arrays;

public class solution11 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Kia");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for(int i=0;i<cars.size();i++) {
            System.out.println(cars.get(i));
        }
    }
}
