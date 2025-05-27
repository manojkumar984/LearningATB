package ex_09_switch;

import java.util.Scanner;

public class Lab01_Switches {
    public static void main(String[] args) {

        // you need to take a user input and ask for the integer from 1 to 7
        // and if user enter 1 to 7
        // you will tell which day it is.

        // step 1 using the scanner class.
        // step 2 figuring out the expression and the day
        // step 3 rough logic
        // step 4 write and fix the logic and optimize
        // step 5 figure out the edge cases
        // This is called as logic building formula

        // Step number 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1 to 7");

        if (scanner.hasNext()) {
            int day = scanner.nextInt();
            switch (day) {

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thrusday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Enter ony 1 to 7 numbers you fool buddy");
            }

        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

    }
}



