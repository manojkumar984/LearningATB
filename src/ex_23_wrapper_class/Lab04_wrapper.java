package ex_23_wrapper_class;

public class Lab04_wrapper {
    public static void main(String[] args) {
        int a = 10;
        Integer b = a;
        System.out.println(a);
        System.out.println(b.intValue());

        // unboxing
        Integer aa = 43;
        int a1 = aa;
        System.out.println(a1);
        System.out.println();


        Integer a11 = 10;

        Integer myint = 10;
        String stringvalue = myint.toString();
        int p_int = myint.intValue();
        int p_int2 = myint;

    }
}
