package Task_25_may;

import java.util.Scanner;

public class Task_Grade_calulator {

    // Write a program that calculates and displays
    // the letter grade for a given numerical score
    // (e.g., A, B, C, D, or F) based on the following grading scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter only integer");
        int num = scanner.nextInt();

        if (num >= 90 && num <= 100){
            System.out.println("your grade is A");

        } else if (num >= 80 && num <= 89) {
            System.out.println("your grade is B");
            
        } else if (num >= 70 && num <= 79) {
            System.out.println("your grade is C");

        } else if (num >=60 && num <=69) {
            System.out.println("your grade is D");

        } else if (num >= 0 && num <= 59) {
            System.out.println("you fail, please rewrite the exam for better improvement");

        }else{
            System.out.println("invalid number, please enter 0 to 100");
        }
        System.out.println("And your score is " + num);
    }
}
