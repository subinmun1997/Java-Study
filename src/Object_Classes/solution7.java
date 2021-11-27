package Object_Classes;

public class solution7 {
    public static void main(String[] args) {
        F f1 = new F();
        F f2 = new F();
        f1.setI(10);
        System.out.println("f1 i is " + f1.getI());

        f2.setI(45);
        System.out.println("f2 i is " + f2.getI());
    }
}
class F {
    private int i = 5;
    private static double k = 0;

    void setI(int i) {
        this.i = i;
    }
    int getI() {
        return i;
    }
    static void setK(double k){
        F.k = k;
    }
}
