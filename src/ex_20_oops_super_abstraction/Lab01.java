package ex_20_oops_super_abstraction;

public class Lab01 {
    public static void main(String[] args) {
        car c1 = new car(100);
        c1.display();
    }
}

class motorcycle{
    public int maxspeed = 180;

     void notest(){
         System.out.println("Empty");
     }
     motorcycle(){
         System.out.println("Default Const");
     }
     motorcycle(int a){
         System.out.println("param con");
     }
     motorcycle(int a, int b){
         System.out.println("param con");
     }

     // method overloading

    void message(){
        System.out.println("no return, no argument");
    }

    void message(int a){
        System.out.println("PC-argument");
    }
    void display(){
        System.out.println("motorcycle parent");
    }
}

class car extends motorcycle{

    private int maxspeed = 280;

    car(){
        super(100);
    }

    void test(){}

    car(int a ){
        System.out.println("PC car");
    }

    @Override
    void display(){
        System.out.println("over ride of car");
        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);
        super.notest();
        this.test();
    }
}
