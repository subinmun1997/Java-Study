package Object_Classes;

public class solution4 {
    public static void main(String[] args) {
        Student student = new Student();
        //if a data field of a reference type does not reference any object, the data field holds a special literal value, null
        //the default value of a data field is null for a reference type, 0 for a numeric type, false for a boolean type, and '\u0000' for a char type.
        System.out.println("name? " + student.name);
        System.out.println("age? " + student.age);
        System.out.println("isScienceMajor? " + student.isScienceMajor);
        System.out.println("gender? " + student.gender);
    }
}

class Student {
    String name;
    int age;
    boolean isScienceMajor;
    char gender;
}