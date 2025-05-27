package ex_09_switch;

import java.util.Scanner;

public class Task_1_12_months {
    public static void main(String[] args) {
        // Write a Java program that takes a month number
        // (1-12) and prints the number of days in that month using a switch statement.
        // Handle February separately for leap years.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = scanner.nextInt();
        System.out.println("Enter the month for days");
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("31 days");
                break;
            case 2:
                if (year%4==0) {
                    System.out.println("29 days");
                }
                else {
                    System.out.println("28 days");
                }
                break;
            case 3:
                System.out.println("31 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            case 5:
                System.out.println("31 days");
                break;
            case 6:
                System.out.println("30 days");
                break;
            case 7:
                System.out.println("31 days");
                break;
            case 8:
                System.out.println("31 days");
                break;
            case 9:
                System.out.println("30 days");
                break;
            case 10:
                System.out.println("31 days");
                break;
            case 11:
                System.out.println("30 days");
                break;
            case 12:
                System.out.println("31 days");
                break;
            default:
                System.out.println("Entered invalid value");


                }
        }

    }

