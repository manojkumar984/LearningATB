package ex_18_OOPS_Constructors;

public class Lab02_oops_con {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1);

    }

}
    class A {
        A() {
            System.out.println("i want to read a csv file");
            System.out.println("open the page before loading the script");
            System.out.println("you can do anything you wanted when object is created");
        }
    }

