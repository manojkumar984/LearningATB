package ex_06_ternary_operator;

public class Task3_TO {
    public static void main(String[] args) {

        // result = condition1? expression1 : (condition2 ? expression2 : expression3);

        int age = 69;
        String result = age>69? "senior" : (age<18? "minior" : "adult");
        System.out.println(result);





    }
}
