package ex_08_If_conditions;

public class Task001 {
    public static void main(String[] args) {

        int age = Integer.parseInt(args[0]);
        if (age > 21) {
            System.out.println("you are allowed for racing");
        }else {
            System.out.println("you are not allowed for racing");
        }
    }
}
