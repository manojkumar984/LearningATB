package ex_07_incremental_decremental_operator;

public class Lab01_ID_PREoperator {
    public static void main(String[] args) {



        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        // ++a -->>> a = a + 1

        // ERT TABLE
        // line no |a| Result B
        //  8     |10|  NA
        //  9     |11|  11
        //  10 |11 we are printing|  11
        //  11 |11| 11 - printing
    }
}
