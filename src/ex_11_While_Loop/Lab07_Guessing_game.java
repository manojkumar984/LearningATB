package ex_11_While_Loop;

import java.lang.classfile.Signature;
import java.util.Random;
import java.util.Scanner;

public class Lab07_Guessing_game {
    public static void main(String[] args) {
        // guess a number from 1 to 100
        // we are going to use logic building formula

        // step 1 using the scanner class.
        // step 2 figuring out the expression and the day
        // step 3 rough logic
        // step 4 write and fix the logic and optimize
        // step 5 figure out the edge cases
        // This is called as logic building formula

        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        //System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;

        while (true){
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess){
                System.out.println("To low, try again");
            }else if (guess > numberToGuess)
                System.out.println("To high, try again");
            else {
                System.out.println("correct, you guessed it" +attempts+ "attempt");
                break;
            }
        }


    }
}
