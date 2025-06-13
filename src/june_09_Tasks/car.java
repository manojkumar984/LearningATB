package june_09_Tasks;

// Define a Car class with brand, model, and price.
// Initialize using constructor and print car details.

public class car {
    public static void main(String[] args) {
        car skoda = new car( "skoda", "slavia", "16.5 lakhs on road price");
        skoda.display();
    }
    private String brand;
    private String model;
    private String price;

    public car(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display(){
        System.out.println("car brand = " + brand);
        System.out.println();
        System.out.println("car model = " + model);
        System.out.println();
        System.out.println("car price = " + price);
        System.out.println();
    }
}
