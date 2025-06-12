package ex_19_superkeyword;

public class Lab02 {
    public static void main(String[] args) {

    }
}

class Father {
    Father(){
        System.out.println("DC Father");
    }

    int gold = 10;

    void home(){
        System.out.println("Home Father");
    }
}

class son extends Father{
    son(){
        super();
    }

    void newHome(){
        super.home();
        System.out.println(super.gold);
    }
}
