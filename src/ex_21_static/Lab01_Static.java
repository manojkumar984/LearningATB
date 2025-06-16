package ex_21_static;

public class Lab01_Static {

    public static void main(String[] args) {
        student s1 = new student(23);
        student s2 = new student(33);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(student.course_name);
        System.out.println(student.course_name);
    }
}

class student{

    int age; // non static, instance varaible, attribute
    static String course_name = "ATB";

    public student(int age_c) {
        this.age = age_c;
    }

    static void m1(){
        System.out.println("I am Static method");
    }
}
