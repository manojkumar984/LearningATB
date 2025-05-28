package ex_13_functions;

import javax.lang.model.element.Name;
import java.util.Scanner;

public class Lab04_user_defined_two {
    public static void main(String[] args) {

          // 4 types of user defined functions
        // 1 without parameters and without return type
        // 2 without parameters but with return type
        // 3 with parameters and without return type
        // 4 with parameters and with return type


        // 1 without parameters and without return type.
        wp_wr_greet();

        // 2 without parameters but with return type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg);

        // 3 with parameters and without return type (90%)
        greet_with_details("manoj",  65, 1000);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = scanner.next();
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        greet_with_details(name,age,salary);

        // 4 with parameters and with return type
        int sum = sum_of_two_numbers(3,5);
        int sum2 = sum_of_two_numbers(190,900);

        System.out.println(sum);
        System.out.println(sum2);







    }


    // 1 without parameters and without return type. declare/define


    static void wp_wr_greet(){
        System.out.println("hi,how are you ?");
    }

    // 2 without parameters but with return type
    static String greet_with_hello_wp_with_RT(){
        System.out.println("hi");
        return "hi, how are you ?";
    }


    // 3 with parameters and without return type
     static void greet_with_details(String name, int age, double salary){
         System.out.println("your name is ->" + name + "\nyour age is" + age + "\nyour salary is" +salary);
     }


    // 4 with parameters and with return type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }
    static int sum_of_three_numbers(int a, int b, int c){
        return a+b+c;
    }



}
