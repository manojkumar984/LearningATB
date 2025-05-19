package ex_06_ternary_operator;

public class Lab_03_TO_interview_question {
    public static void main(String[] args) {
        // nested ternary
        // result = condition1? expression1 : (condition2 ? expression2 : expression3);

        int number = 21;
        String result = (number < 18) ? (number > 25 ? "you can drink" : "you cant drink") :  "you cant go goa";
        System.out.println(result);

        int x = 10;
        int y = 20;
        System.out.println(Math.max(x,y));
    }
}
