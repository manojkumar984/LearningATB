package poly_method_overloading;

public class Lab01_MOloading {
    public static void main(String[] args) {
        mathoperations m1 = new mathoperations();
        int r = m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,4,5);
        System.out.println(r1);

        double r0 = m1.add(3.34,4.56);
        System.out.println(r1);
    }
}
