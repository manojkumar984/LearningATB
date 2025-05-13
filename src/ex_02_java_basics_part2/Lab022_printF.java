package ex_02_java_basics_part2;

public class Lab022_printF {
    public static void main(String[] args) {
        int a = 10;
       // System.out.println(a);
        //System.out.printf("your variable is %d",a);
        // %d -> int, byte, long, short,
        // %s -> string
        // %f -> float, double,
        // %b -> boolean

        int b = 20;
        System.out.printf("a value is this %d, b value is this  %d", a, b);
        System.out.println();
        System.out.printf("your value is this %d, your value is this  %d", a, b);
        System.out.println();
        System.out.printf("a = %d, b = %d", a, b);



    }
}
