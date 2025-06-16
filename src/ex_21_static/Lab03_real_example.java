package ex_21_static;

public class Lab03_real_example {
    public static void main(String[] args) {


    }
}

class ATB1{

    {
        System.out.println("IIB this is called when object is created");
        // what is the purpose
        // here you can writ code related too
        // start a website or anything before starting the
        // web automation or api automation
    }
    static {
        System.out.println("Load the class, i will excute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void readDocument(){
        System.out.println("non static method");
        System.out.println(courseName);
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }
}
