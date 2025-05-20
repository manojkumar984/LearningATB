package ex_06_ternary_operator;

public class Task1_TO {
    public static void main(String[] args) {
        // result = condition ? expressional1 : expression2;
        // The ternary operator and let me know if I give you a number
        // Let me know if it is even or odd.

        // num%2 == 0 >>> even else or odd
        int num = 10;
        String result = num % 2 == 0? "even" : "odd";
        System.out.println(result);

    }
}
