package Object_Classes;

public class solution31 {
    public static void main(String[] args) {
        Pig3 myPig = new Pig3();
        myPig.animalSound();
        myPig.sleep();
    }
}

class Pig3 implements Animal4 {
    @Override
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
    @Override
    public void sleep() {
        System.out.println("Zzz");
    }
}
