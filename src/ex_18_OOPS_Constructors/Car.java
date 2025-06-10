package ex_18_OOPS_Constructors;

public class Car {

    String name;
    int year;
    String model;

    // default constructor

    Car(){
        name = "unknow car";
        model = "XXX";
        year = 0;
        System.out.println("DC");
    }
}
