package ex_16_Arrays;

public class Lab04_Array_part3 {
    public static void main(String[] args) {

        int[] marks = {90, 91, 92, 93, 94, 95, };
        System.out.println(marks.length); // length will always start from 1
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("---------");

        // for loop model

        for (int i = 0; i <marks.length ; i++) {
            System.out.println(marks[i]);

            System.out.println("--------------");

            // enhanced for loop model

            for (int mark : marks){
                System.out.println(mark);
            }

        }

    }
}
