package ex_16_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab09_2nd_highest_number {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
    }
}
