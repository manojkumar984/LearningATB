package ex_24_exceptions;

public class Lab04_example {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }
}
