package Task_25_may;

import java.util.Scanner;

public class Task_reverse_the_number {
    // 1.Reverse the number using for loop. (In - 12345, Out - 54321)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        if (scanner.hasNext()){
            int num = scanner.nextInt();
            int revNum = 0;
            while (num>0) {
                revNum = num% + revNum*10;
                num = num/10;
            }
            System.out.println(revNum);
        }
        else {
            System.out.println("please enter an integer only");
        }


    }
}
