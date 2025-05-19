package ex_06_ternary_operator;

public class Task1_TO {
    public static void main(String[] args) {
        // result = condition ? expressional1 : expression2;
        int num = 10;
        String result = num % 2 == 0? "even" : "odd";
        System.out.println(result);

    }
}
