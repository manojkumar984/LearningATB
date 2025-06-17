package ex_23_wrapper_class;

public class Lab05_wrapper_conversion {
    public static void main(String[] args) {

        String num = "10";
        int aa = 10;

        // String to wrapper convrsion
        Integer a = Integer.parseInt(num);

        // string to premitive
        int a_p = Integer.parseInt(num);

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);

        Integer aa10 = 10;
        String s = aa10.toString();
        System.out.println(s);
    }
}
