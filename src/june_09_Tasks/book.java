package june_09_Tasks;
// Write a Book class that takes
// title, author, and price via constructor. Display all values.

public class book {

    public static void main(String[] args) {
        book b1 = new book("The Power of habit","Charles Dhurgig","899");
        b1.display();
    }
    private String title;
    private String author;
    private String price;

    public book(String title, String author, String price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display(){
        System.out.println("Book Title = " +title);
        System.out.println("Book Author = " +author);
        System.out.println("Book Price = " +price);
    }
}
