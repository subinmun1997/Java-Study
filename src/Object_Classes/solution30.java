package Object_Classes;

public class solution30 {
    public static void main(String[] args) {
        Pig2 myPig = new Pig2();
        myPig.animalSound();
        myPig.sleep();
    }
}
abstract class Animal3 {
    public abstract void animalSound();

    public void sleep() {
        System.out.println("Zzz");
    }
 }
 class Pig2 extends Animal3 {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
 }
