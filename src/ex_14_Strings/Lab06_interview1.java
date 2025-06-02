package ex_14_Strings;

public class Lab06_interview1 {
    public static void main(String[] args) {

        String s1 = "Hello";  // SCP logic
        String s4 = "Hello";

        String s2 = new String("Hello"); // Object area logic
        String s3 = new String("Hello");
        String s5 = new String("Hello");

        // == -> comparision -> string => this check the ref loction

        System.out.println(s1 == s3);
        System.out.println(s1 == s4);

        // equals
        System.out.println(s1.equals(s2));
    }
}
