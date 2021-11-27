package Object_Classes;
import java.util.HashMap;

public class solution15 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);

        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");

    }
}
