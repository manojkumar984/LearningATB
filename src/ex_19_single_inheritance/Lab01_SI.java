package ex_19_single_inheritance;

public class Lab01_SI {
    public static void main(String[] args) {

        Son manoj = new Son();
        System.out.println(manoj.gold_f);
        manoj.bhk3();
        manoj.bhk2();

        cousin c = new cousin();
        c.bhk31();
        // System.out.println(c.gold); he does not extends my fathers gold
    }
}
