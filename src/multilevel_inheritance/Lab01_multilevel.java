package multilevel_inheritance;

import ex_19_single_inheritance.Father;

public class Lab01_multilevel {
    public static void main(String[] args) {
        son manoj = new son();
        father f = new father();
        grandfather gf = new grandfather();

        son s1 = new son();
        // son s2 = new father();
        father f1 = new son(); // dynamic speech
        grandfather gf1 = new son();
        grandfather gf2 = new father();
        //son s3 = new grandfather();

    }
}
