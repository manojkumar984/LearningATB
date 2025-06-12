package ex_19_Accessmodifer.criminal;

import ex_19_Accessmodifer.police.cop;

public class thief {
    public static void main(String[] args) {
        cop thief = new cop(10);
        thief.canIshoot();
        // System.out.println(thief.gun);
    }
}
