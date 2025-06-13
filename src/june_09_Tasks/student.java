package june_09_Tasks;
// Create a class Student with a constructor to initialize name and age.
// Print both using a display method.

public class student {
    private String name;
    private String age;

    public student(String name, String age) {
        this.name = name;
        this.age = age;
    }
    void display(){
        System.out.println("student name -> " +name);
        System.out.println("student age -> " +age);
    }

    public static void main(String[] args) {
        student s1 = new student("manoj","24");
        student s2 = new student("kumar","29");
        s1.display();
        s2.display();
    }
}
