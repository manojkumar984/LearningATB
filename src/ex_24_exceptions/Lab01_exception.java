package ex_24_exceptions;

public class Lab01_exception {
    public static void main(String[] args) {
        System.out.println("start the program");

        // main core
        String ip = args[0];
        int a = Integer.parseInt(ip);
        int b = 100/a;

        System.out.println(b);
        System.out.println("End the program");
    }
}
