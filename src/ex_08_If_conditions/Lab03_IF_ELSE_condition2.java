package ex_08_If_conditions;

public class Lab03_IF_ELSE_condition2 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("you will get licence");
        }else {
            System.out.println("you will not get licence");
        }
    }
}
