package ex_13_functions;

public class Lab02_simple_method {
    public static void main(String[] args) {

        non_return_type_func();

        String a = return_type_func();
        System.out.println(a);

    }

    static void non_return_type_func(){
        System.out.println("Hi, non return type");
    }

    static String return_type_func(){
        System.out.println("hi, non return type");
        return "manoj";
    }
}
