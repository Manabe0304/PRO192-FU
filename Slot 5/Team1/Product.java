/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

public class Product {
    // Private fields
    private String name;
    private double price;
    private int quantity;
    
    // Constructor
    public Product(String name, double price, int quantity) {
        // Your code here
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Getter for name
    public String getName() {
        // Your code here
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        // Your code here
        this.name = name;
    }
    
    // Getter for price
    public double getPrice() {
        // Your code here
        return price;
    }
    
    // Setter for price
    public void setPrice(double price) {
        // Your code here
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be positive");
        }
    }
    
    // Getter for quantity
    public int getQuantity() {
        // Your code here
        return quantity;
    }
    
    // Setter for quantity
    public void setQuantity(int quantity) {
        // Your code here
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative");
        }
    }
    
    // Method to calculate the total value of the product
    public double calculateTotalValue() {
        // Your code here
        return price * quantity;
    }
    
    public static void main(String[] args) {
        // Create a Product object
        Product product = new Product("Laptop", 1000.0, 2);
        
        // Modify the attributes using setters
        product.setName("Smartphone");
        product.setPrice(800.0);
        product.setQuantity(5);
        
        // Print the total value of the product
        System.out.println("Total Value: " + product.calculateTotalValue());
    }
}
