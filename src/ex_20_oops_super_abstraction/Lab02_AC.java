package ex_20_oops_super_abstraction;

public class Lab02_AC {
    public static void main(String[] args) {
        creta car = new creta();
        car.drive();

    }
}



















class creta extends Engine implements Tyre,Gear {

    void drive(){
        rubberTyre();
        blackColorDoToTyre();
        startEngine();
        changeGear();
        stopEngine();
    }


    @Override
    void startEngine(){
        System.out.println("starting the creta");
    }

    @Override
    public void rubberTyre() {

    }

    @Override
    public void blackColorDoToTyre() {

    }

    @Override
    public void burnTheTyre() {

    }

    @Override
    public void changeGear() {

    }
}

abstract class Engine{
    abstract void startEngine();
    void stopEngine(){
        System.out.println("stop");
    }
}

interface Tyre{
    void rubberTyre();
    void blackColorDoToTyre();

    // After jdk >> this featur is introduce
    default void burnTheTyre(){

    }

    static void m1(){}
}

interface Gear {
    void changeGear();
}
