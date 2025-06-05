package Task_01_june_Arrays;

public class Sum_of_Arrays {

    // Sum of All Items of the Array
    public static void main(String[] args) {

        int [] numbers = {20, 20, 20, 20, 20, 50, -50};
        int sum = 0;
        for (int i = 0; i < numbers.length ; i++) {
            sum = sum+numbers[i];

        }
        System.out.println(sum);
    }
}
