package ex_08_If_conditions;

import java.util.Scanner;

public class Scanner_Task {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 21) {
            System.out.println("you are eligible for racing");
        }else {
            System.out.println("you are not eligible for racing");
        }

    }
}
