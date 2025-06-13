package june_09_Tasks;

//Create a Rectangle class.
// Pass length and breadth via constructor,
// calculate and print area.

public class rectangle {

    public static void main(String[] args) {
        rectangle r1 = new rectangle(3.5,5.5);
        r1.calculatArea();
    }

    private double length, breadth, area;

    rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void calculatArea(){
        System.out.println("Length = " +length);
        System.out.println("Breadth = " +breadth);
        System.out.println("Area of rectangle = " +area);
    }


}
