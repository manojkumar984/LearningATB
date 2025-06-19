package ex_24_exceptions;

public class Lab03_checked {
    public static void main(String[] args) {

        int a = 0;
        try {
            a = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}
