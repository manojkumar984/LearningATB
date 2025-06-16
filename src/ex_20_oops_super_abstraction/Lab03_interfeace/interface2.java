package ex_20_oops_super_abstraction.Lab03_interfeace;

public class interface2 {
    public static void main(String[] args) {
        manoj g = new gollapalli();
        gollapalli g1 = new gollapalli();
        g.display();
        System.out.println(g.a);
    }
}

class gollapalli implements manoj{

    @Override
    public void display() {
        System.out.println(a);

    }
}

interface manoj{
    int a = 10;
    void display();
}
