package Object_Classes;

public class solution27 {
    public static void main(String[] args) {
        A2 a = new A2();
        a.p(10);
        a.p(10.0);

    }
}
class B2 {
    public void p(double i) {
        System.out.println(i*2);
    }
}
class A2 extends B {
    public void p(int i) {
        System.out.println(i);
    }
}