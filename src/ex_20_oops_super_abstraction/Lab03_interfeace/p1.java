package ex_20_oops_super_abstraction.Lab03_interfeace;

import ex_18_OOPS_Constructors.Car;

public class p1 {

    public static void main(String[] args) {
        car1 car1 = new car1();
        car1.drive();
    }

    static class car1 implements Engine1, Brakes{

        void drive(){
            startEngine();
            applyBreak();
            stopEngine();
        }

        @Override
        public void applyBreak() {
            System.out.println("Apply Break");
        }

        @Override
        public void startEngine() {
            System.out.println("Start Engine");

        }

        @Override
        public void stopEngine() {
            System.out.println("Stop Engine");

        }
    }
}

    interface Brakes {
        void applyBreak();
    }

    interface Engine1{

        void startEngine();
        void stopEngine();
        default void testEngine(){
            System.out.println("concrete complete");
        }
    }

