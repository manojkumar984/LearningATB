package june_09_Tasks;

public class supercar {

    public static void main(String[] args) {
        supercar s1 = new supercar("BMW","M2","1.5CR on Road Hyderabad");
        s1.display();
    }

    private String brand;
    private String model;
    private String price;

    public supercar(String brand, String model, String price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void display(){
        System.out.println("Super Car Brand = "+brand);
        System.out.println("Super Car Model = "+model);
        System.out.println("Super Car Price = "+price);
    }
}
