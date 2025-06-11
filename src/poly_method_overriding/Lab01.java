package poly_method_overriding;

public class Lab01 {
    public static void main(String[] args) {
        manoj m = new manoj();
        m.home();
        m.m1();

        father f1 = new father();
        f1.home();
        f1.f1();

        father f2 = new manoj();
        f2.home();
    }
}
