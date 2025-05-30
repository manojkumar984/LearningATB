package ex_13_functions;

import java.util.Scanner;

public class Lab05_Function_arth {
    public static void main(String[] args) {

        // create a function sub, sum, mul, and div
        // with parameters a, b (take the parameter from the user)

        // logic building
        // step 1 inputas and outputs
        // a, b int --> scanner
        // int -> varaible result ->

        // step 2 rough logic -> create functions
        // function -> type 4th -> with return and arguments/parameters

        // step 3 write the code and find and fix

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner,"Enter the num1: ");
        int b = readInt(scanner,"Enter the num2: ");

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_mul = mul(a,b);
        int result_div = div(a,b);
        int result_mod = mod(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);

    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter an int only.");
            System.exit(0);
            return -1;
        }
    }

    static int sum(int a, int b) {
    return a + b;
    }

    static int sub(int a, int b){
        return a - b;
    }

    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("division by zero not allowed.");
        }
        return a/b;
    }

    static int mul(int a, int b){
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}
