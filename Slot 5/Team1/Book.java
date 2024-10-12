package Team1;

public class Book {
    // Attributes
    private String title;
    private String author;
    private double price;
    
    // Constructor with parameters
    public Book(String title, String author, double price) {
        // Your code here
        this.title = title;
        this.author= author;
        this.price = price;
    }
    
    // Default constructor
    public Book() {
        // Your code here
        this.title = "Truyen Kieu";
        this.author= "Nguyen Du";
        this.price = 5.33;
    }
    
    public static void main(String[] args) {
        // Create an object using parameterized constructor
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        
        // Create an object using default constructor
        Book book2 = new Book();
        
        // Print details of the books (Hint: you can use getters to access private fields)
        // Your code here
        System.out.println("Title: " + book1.title + ", Author: " + book1.author + ", Price: " + book1.price);
        System.out.println("Title: " + book2.title + ", Author: " + book2.author + ", Price: " + book2.price);
    }
}
