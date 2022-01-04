package Standard_of_Java;

public class solution3 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int temp = 0;

        System.out.println("x: " + x + " y: " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + " y: " + y);
    }
}
