package Chapter2;

public class Solution2 {
    public static void main(String[] args) {
        int x=10, y=20;
        int temp=0; // 임시 값 저장소

        System.out.println("x: " + x + " y: " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x + " y: " + y);
    }
}
