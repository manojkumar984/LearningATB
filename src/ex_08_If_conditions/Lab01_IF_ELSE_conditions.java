package ex_08_If_conditions;

public class Lab01_IF_ELSE_conditions {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you will not vote");
        }
    }
}
