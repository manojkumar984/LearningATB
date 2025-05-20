package ex_08_If_conditions;

import java.util.Scanner;

public class Lab05_IF_ELSE_scanner_class {
    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 21) {
            System.out.println("you will drink beer");
        }else {
            System.out.println("you will not drink beer");
        }
    }
}
