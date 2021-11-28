package Object_Classes;

public class solution24 {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudent());
        String[] students = course1.getStudents();
        for(int i=0;i<course1.getNumberOfStudent();i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
        System.out.print("Number of students in course2: " + course2.getNumberOfStudent());
    }
}
class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudent = 0;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student) {
        students[numberOfStudent] = student;
        numberOfStudent++;
    }
    public String[] getStudents() {
        return students;
    }
    public int getNumberOfStudent() {
        return numberOfStudent;
    }
    public String getCourseName() {
        return courseName;
    }
    public void dropStudent(String studnet) {
        // left as an exercise in Exercise 10.9
    }
}
