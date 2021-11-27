package HUFS_PROJ;

import java.util.Scanner;

class StudentInfo {
    int s_id, c_id;
    String s_name, s_address, s_department;

    public String getS_department() {
        return s_department;
    }
    public void setS_department(String s_department) {
        this.s_department = s_department;
    }
    public String getS_address() {
        return s_address;
    }
    public void setS_address(String s_address) {
        this.s_address = s_address;
    }
    public String getS_name() {
        return s_name;
    }
    public void setS_name(String s_name) {
        this.s_name = s_name;
    }
    public int getS_id() {
        return s_id;
    }
    public void setS_id(int s_id) {
        this.s_id = s_id;
    }
    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
}

class CourseInfo {
    int c_id;
    String c_name, c_major, c_prof, c_score;

    public int getC_id() {
        return c_id;
    }
    public void setC_id(int c_id) {
        this.c_id = c_id;
    }
    public String getC_name() {
        return c_name;
    }
    public void setC_name(String c_name) {
        this.c_name = c_name;
    }
    public String getC_major() {
        return c_major;
    }
    public void setC_major(String c_major) {
        this.c_major = c_major;
    }
    public String getC_prof() {
        return c_prof;
    }
    public void setC_prof(String c_prof) {
        this.c_prof = c_prof;
    }
    public String getC_score() {
        return c_score;
    }
    public void setC_score(String c_score) {
        this.c_score = c_score;
    }
}

public class solution10 {
    static int count = 0;
    static int course_count = 0;
    static StudentInfo[] student;
    static CourseInfo[] course;

    public static void main(String[] args) {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max size of array student: ");
        int student_size = scanner.nextInt();
        student = new StudentInfo[student_size];
        System.out.print("Enter number of course: ");
        int course_size = scanner.nextInt();
        course = new CourseInfo[course_size];

        for(int i=0;i<100;i++) {
            student[i] = new StudentInfo();
        }
        for(int j=0;j<100;j++) {
            course[j] = new CourseInfo();
        }
        for(int i=0;i<3;i++) {
            System.out.print("Enter Course ID: ");
            int cid = scanner.nextInt();
            course[i].setC_id(cid);

            System.out.print("Enter Course name: ");
            String cname = scanner.next();
            course[i].setC_name(cname);

            System.out.print("Enter Course major: ");
            String cmajor = scanner.next();
            course[i].setC_major(cmajor);

            System.out.print("Enter Course prof: ");
            String cprof = scanner.next();
            course[i].setC_prof(cprof);

            System.out.print("Enter Course score: ");
            String cscore = scanner.next();
            course[i].setC_score(cscore);
        }
        System.out.println("menu driven Student Management program");
        System.out.println("1.Add student information");
        System.out.println("2.Update student information");
        System.out.println("3.Search student information");
        System.out.println("4.Delete student information");
        System.out.println("5.Display a list of all student");
        System.out.println("6.Display a list of all courses");
        System.out.println("7.Display a list of students registered in each courses");


        System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
        int num = scanner.nextInt();

        while (true) {
            switch (num) {
                case 1:
                    System.out.print("Enter s_id: ");
                    int id = scanner.nextInt();
                    if (checkID(id)) {
                        student[count].setS_id(id);
                        System.out.print("Enter s_name: ");
                        String name = scanner.next();
                        student[count].setS_name(name);
                        System.out.print("Enter s_address: ");
                        String addr = scanner.next();
                        student[count].setS_address(addr);
                        System.out.print("Enter s_depart: ");
                        String depart = scanner.next();
                        student[count].setS_department(depart);
                        System.out.print("Enter selected course id: ");
                        int course_id = scanner.nextInt();
                        student[count].setC_id(course_id);
                    }
                    count++;
                    System.out.println("Saved");
                    System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
                    num = scanner.nextInt();
                    break;
                case 2:
                    updateStudent();
                    System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
                    num = scanner.nextInt();
                    break;
                case 3:
                    searchStudent();
                    System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
                    num = scanner.nextInt();
                    break;
                case 4:
                    deleteStudent();
                    System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
                    num = scanner.nextInt();
                    break;
                case 5:
                    displayStudent();
                    System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
                    num = scanner.nextInt();
                    break;
                case 6:
                    for(int i=0;i<course_size;i++) {
                        System.out.println("course name is " + course[i].getC_name());
                    }
                    System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
                    num = scanner.nextInt();
                    break;
                case 7:
                    for(int i=0;i<course_size;i++) {
                        System.out.println("registered course name and student name: " + course[i].getC_name());
                        for(int j=0;j<count;j++) {
                            if(student[j].getC_id() == course[i].getC_id()) {
                                System.out.print(student[j].getS_name() + " ");
                            }
                        }
                        System.out.println();
                    }
                    System.out.print("Enter number between 1 to 7. If you want to break enter number grater than 7 : ");
                    num = scanner.nextInt();
                    break;
                default:
                    flag = 1;
            }
            if (flag == 1) {
                break;
            }
        }
    }

    public static boolean checkID(int id) {
        for(int i=0;i<count;i++) {
            if(id == student[i].getS_id()) {
                System.out.println("Duplicated ID");
                return false;
            }
        }
        return true;
    }



    public static void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter s_id do you want to update: ");
        int update = scanner.nextInt();
        int chk = 0;
        for (int i = 0; i < count; i++) {
            if (update == student[i].getS_id()) {
                System.out.print("Enter new Student_id: ");
                int new_id = scanner.nextInt();
                student[i].setS_id(new_id);
                System.out.print("Enter new Student_name: ");
                String new_name = scanner.next();
                student[i].setS_name(new_name);
                System.out.print("Enter new Student_address: ");
                String new_addr = scanner.next();
                student[i].setS_address(new_addr);
                System.out.print("Enter new Student_department: ");
                String new_depart = scanner.next();
                student[i].setS_department(new_depart);
                System.out.print("Enter new Student_course_id: ");
                int new_course_id = scanner.nextInt();
                student[i].setC_id(new_course_id);
                chk = 1;
                break;
            }
            if (chk == 0) {
                System.out.println("not exists id");
                break;
            }
        }
    }



    public static void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter s_id do you want to search: ");
        int search = scanner.nextInt();

        for(int i=0;i<count;i++) {
            if(search == student[i].getS_id()) {
                System.out.println("S_id is " + student[i].getS_id());
                System.out.println("S_name is " + student[i].getS_name());
                System.out.println("S_address is " + student[i].getS_address());
                System.out.println("S_department is " + student[i].getS_department());
                System.out.println("S_selected_course is " + course[student[i].getC_id()-1].getC_name());
            }
            else {
                System.out.println("not exists id");
            }
        }
        System.out.println();
    }

    public static void deleteStudent() {
        int idx=0, chk=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter s_id do you want to delete: ");
        int delete = scanner.nextInt();
        for(int i=0;i<count;i++) {
            if(delete == student[i].getS_id()) {
                idx = i;
                chk = 1;
            }
        }
        if(chk == 0) {
            System.out.println("not exists id");
        } else {
            for(int i=idx;i<count;i++) {
                student[i] = student[i+1];
            }
            count--;
        }

    }

    public static void displayStudent() {
        for(int i=0;i<count;i++) {
            System.out.print(student[i].getS_id() + " ");
            System.out.println(student[i].getS_name());
        }
    }
}