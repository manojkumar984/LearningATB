package Task_01_june_Arrays;

import java.util.Arrays;

public class Smallest_number_array {
    // Print the Smallest Element in an Array

    public static void main(String[] args) {

        int [] numbers = {20, 80, 90, 70, 40, 30, 100};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length -7]);
    }
}
