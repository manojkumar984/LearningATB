package ex_16_Arrays;

public class Lab05_Array_max_min {
    public static void main(String[] args) {
        // how to find  max and min value

        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int max = array[0];
        int min = array[0];

        // logic

        for (int i = 0; i < array.length ; i++) {
            if(array[i] > max){
                max = array[i];
            }

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
            
        }

        System.out.println("max is," + max);
        System.out.println("min is," + min);

;




    }
}
