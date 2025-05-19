package ex_06_ternary_operator;

public class Task2_TO {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int c=1;

        // result = condition1? expression1 : (condition2 ? expression2 : expression3);

        String result= a>b?(a>c?"a is greater": "c is greater"):(b>a?(b>c?"b is greater": "c is greater"): "c is greater");
        System.out.println( result);
    }
}
