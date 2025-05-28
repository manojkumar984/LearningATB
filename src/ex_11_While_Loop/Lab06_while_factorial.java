package ex_11_While_Loop;

import java.util.Scanner;

public class Lab06_while_factorial {
    public static void main(String[] args) {
        // factorial program

        // step 1 using the scanner class.
        // step 2 figuring out the expression and the day
        // step 3 rough logic
        // step 4 write and fix the logic and optimize
        // step 5 figure out the edge cases
        // This is called as logic building formula

        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to factorial program");
        System.out.println("Enter the factorial, whose factorial you want!");

        if (!scanner.hasNext()){
            System.out.println("Enter the int, return the program");
        }
        int number = scanner.nextInt();
        int factorial = 1;

        if (number <=0){
            System.out.println("factoria is ->" +factorial);
        }

        int i = 1;
         while (i<=number){
             factorial = factorial*i;
             i++;
         }

        System.out.println("factorial is ->" +factorial);

    }
}
