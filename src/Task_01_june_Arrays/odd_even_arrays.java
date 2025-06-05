package Task_01_june_Arrays;

public class odd_even_arrays {

    // Odd and Even Numbers from an Array

    public static void main(String[] args) {
        int [] numbers = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int even;
        int odd;
        System.out.println("Even numbers are : ");
        for (int i : numbers){
            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Odd numbers are : ");
        for (int j : numbers) {
            if (j%2!=0){
                System.out.print(j + " ");
            }
        }
    }
}
