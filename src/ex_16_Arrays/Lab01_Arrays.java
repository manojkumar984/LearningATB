package ex_16_Arrays;

public class Lab01_Arrays {
    public static void main(String[] args) {

        int a = 10;
        int [] marks = {91, 92, 93, 94, 95, 96};
        boolean [] is_married_people = {true, true, false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[5]);
        // System.out.println(marks[-1]); -> -1 is not allowed in java it show error
    }
}
