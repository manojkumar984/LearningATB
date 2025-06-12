package ex_19_Accessmodifer.police;

public class cop {

    private int gun;
    String iCard;

    public cop(int gun) {
        this.gun = gun;
    }

    public void canIshoot(){
        System.out.println("yes you can shoot");
    }
}
