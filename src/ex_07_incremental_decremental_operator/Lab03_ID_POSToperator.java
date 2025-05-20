package ex_07_incremental_decremental_operator;

public class Lab03_ID_POSToperator {
    public static void main(String[] args) {


       // post increment = print first then increase



        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        // ERT expression and result table
        // line no |a| Result b
        //  11 |10|     NA
        //  12 |11 |    10
        //  13 |11 |    NA
        //  14 |NA |    10
    }
}
