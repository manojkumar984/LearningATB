package ex_08_If_conditions;

import java.util.Scanner;

public class Lab07_Scanner02 {
    public static void main(String[] args) {

        // Scanner class model

        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 21 ) {
            System.out.println("you will allowed to drink beer");
        }else {
            System.out.println("you will not allowed to drink beer");
        }
    }
}
