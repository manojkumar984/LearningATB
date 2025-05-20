package ex_07_incremental_decremental_operator;

public class Lab02_Advance_ID_operator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ +a);

        // A+B
        // A --> a++ --> EXPA -->> 10, a --> 11
        // +
        // B --> ++a --> EXPB --> 11



        // ERT
        // Line no |a| EXP
        // 5 |10|       NA
        // 6 |  |        10 + 11 --> 21

    }
}
