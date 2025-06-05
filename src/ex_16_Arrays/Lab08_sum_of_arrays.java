package ex_16_Arrays;

public class Lab08_sum_of_arrays {
    public static void main(String[] args) {


        int[] numbers = {12, 34, 55};
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum = sum+numbers[i];

        }

        System.out.println(sum);

        }
    }

