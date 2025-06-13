package june_09_Tasks;

public class bike {

    public static void main(String[] args) {
        bike b1 = new bike("Triump","speed triple 1200","12 lakhs on road price in hyderabad");
        b1.display();
    }
    private String brand;
    private String model;
    private String price;
    // constructor

    public bike(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display(){
        System.out.println("Bike Brand = " +brand);
        System.out.println("Bike Model = " +model);
        System.out.println("Bike Price = " +price);
    }
}
