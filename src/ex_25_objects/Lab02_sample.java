package ex_25_objects;

public class Lab02_sample  extends Object {


    @Override
    public String toString() {
        System.out.println("This is coming from object? class");
        return null;
    }

    @Override
    public int hashCode() {
        System.out.println("coming from object method");
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("This is also coming fro object class");
        return true;
    }
}


