package Task_01_june_Arrays;

import java.util.Arrays;

public class Largest_number_array {

    // Print the Largest Element in an Array
    public static void main(String[] args) {
        int [] numbers = {30, 60, 90, 110, 200, 230};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length -1]);
    }
}
