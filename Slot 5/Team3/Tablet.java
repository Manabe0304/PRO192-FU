/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

/**
 *
 * @author Asus
 */
public class Tablet {
    // Attributes
    private String brand;
    private String model;
    private double price;
    
    // Constructor with all parameters
    public Tablet(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // Constructor with brand and model
    public Tablet(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 300.00;
    }
    
    // Constructor with only brand
    public Tablet(String brand) {
        this.brand = brand;
        this.model = "Unknown";
        this.price = 300.00;
    }
    
    public static void main(String[] args) {
        // Create an object using constructor with all parameters
        Tablet tablet1 = new Tablet("Apple", "iPad Pro", 999.99);
        
        // Create an object using constructor with brand and model
        Tablet tablet2 = new Tablet("Samsung", "Galaxy Tab");
        
        // Create an object using constructor with only brand
        Tablet tablet3 = new Tablet("Lenovo");
        
        // Print details of the tablets
        System.out.println("Tablet 1: " + tablet1.brand + ", " + tablet1.model + ", $" + tablet1.price);
        System.out.println("Tablet 2: " + tablet2.brand + ", " + tablet2.model + ", $" + tablet2.price);
        System.out.println("Tablet 3: " + tablet3.brand + ", " + tablet3.model + ", $" + tablet3.price);
    }
}
