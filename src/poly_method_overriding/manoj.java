package poly_method_overriding;

public class manoj extends father{
    void m1(){
        System.out.println("manoj - m1");
    }
    @Override
    void home(){
        System.out.println("manoj - 3bhk");
    }
}
