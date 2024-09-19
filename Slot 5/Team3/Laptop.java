/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

/**
 *
 * @author Asus
 */
public class Laptop {
    // Attributes
    private String brand;
    private String model;
    private double price;
    
    // Constructor with parameters
    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // Default constructor
    public Laptop() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
    }
    
    public static void main(String[] args) {
        // Create an object using parameterized constructor
        Laptop laptop1 = new Laptop("Dell", "XPS 13", 1500.0);
        
        // Create an object using default constructor
        Laptop laptop2 = new Laptop();
        
        // Print details of the laptops
        System.out.println("Laptop 1: " + laptop1.brand + ", " + laptop1.model + ", $" + laptop1.price);
        System.out.println("Laptop 2: " + laptop2.brand + ", " + laptop2.model + ", $" + laptop2.price);
    }
}
