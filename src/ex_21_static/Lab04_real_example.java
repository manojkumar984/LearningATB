package ex_21_static;

public class Lab04_real_example {
    public static void main(String[] args) {
     Automation t1 = new Automation();
        System.out.println(t1.driver);
        System.out.println(Automation.driver);
        Automation.driver = "FireFox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);
    }

}

class Automation{
    static String driver = "chrome";
    static String driver2;
}
