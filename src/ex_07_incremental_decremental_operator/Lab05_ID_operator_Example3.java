package ex_07_incremental_decremental_operator;

public class Lab05_ID_operator_Example3 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a ->> EXPA --> 11, a --> 11
        // +
        // ++a ->> EXPB --> 12, a --> 12
        // EXPA+EXPB = 11 + 12 = 23
    }
}
