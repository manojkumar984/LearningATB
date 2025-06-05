package Task_01_june_Arrays;

public class Reverse_the_number {
    // elements of array in reverse order
    public static void main(String[] args) {
        
        int [] numbers = {1, 2, 3, 4, 5, 6, 7};

        for (int i = numbers.length -1 ; i >=0 ; i--) {
            System.out.print(numbers[i]);
            
        }
    }
}
