package ex_09_switch;

public class Lab04_interview {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("no match");
        }
    }
}
