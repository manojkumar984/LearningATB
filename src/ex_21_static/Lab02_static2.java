package ex_21_static;

public class Lab02_static2 {
    public static void main(String[] args) {

        ATB manoj = new ATB(8989889,"manoj");
        ATB kumar = new ATB(8897257,"kumar");
        System.out.println(manoj.phone_np);
        System.out.println(kumar.name);
        System.out.println(ATB.course_name);
        System.out.println(ATB.course_name);
        ATB.MarkAttendence();


    }
}

class ATB{

    int phone_np;
    String name;
    static String course_name = "ATB";

    public ATB(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }

    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void MarkAttendence(){
        System.out.println("Mark Attendence");
    }
}
