package HUFS_LAB;

public class Lab6_8 {
    public static void main(String[] args) {
        System.out.printf("%-10s%-14s|%-14s%-14s\n", "Celsius","Fahrenheit","Fahrenheit","Celsius");
        double celsius, fahrenheit=120.0;
        for(celsius=40.0;celsius>=31.0;celsius--) {
            System.out.printf("%-10.1f",celsius);
            System.out.printf("%-14.1f", celciusToFahrenheit(celsius));
            System.out.printf("%-14.1f", fahrenheit);
            System.out.printf("%-14.2f\n", fahrenheitToCelsius(fahrenheit));
            fahrenheit -= 10;
        }
    }
    public static double celciusToFahrenheit(double celsius) {
        double fah = (9.0/5) * celsius + 32;
        return fah;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double cel = (5.0/9) * (fahrenheit-32);
        return cel;
    }
}
