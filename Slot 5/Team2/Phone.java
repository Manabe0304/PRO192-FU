/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
public class Phone {
    // Attributes
    private String brand;
    private String model;
    private double price;
    
    // Constructor with all parameters
    public Phone(String brand, String model, double price) {
        // Your code here
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    // Constructor with brand and model
    public Phone(String brand, String model) {
        // Your code here
        this.brand = brand;
        this.model = model;
        this.price = 799.99;
    }
    
    // Constructor with only brand
    public Phone(String brand) {
        // Your code here
        this.brand = brand;
        this.model = "C32";
        this.price = 359.99;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
    
    public static void main(String[] args) {
        // Create an object using constructor with all parameters
        Phone phone1 = new Phone("Apple", "iPhone 13", 999.99);
        
        // Create an object using constructor with brand and model
        Phone phone2 = new Phone("Samsung", "Galaxy S21");
        
        // Create an object using constructor with only brand
        Phone phone3 = new Phone("Nokia");
        
        // Print details of the phones (Hint: you can use getters to access private fields)
        // Your code here
        System.out.println("Phone 1: " + phone1.getBrand() + " " + phone1.getModel() + " with a price of $" + phone1.getPrice());
        System.out.println("Phone 2: " + phone2.getBrand() + " " + phone2.getModel() + " with a price of $" + phone2.getPrice());
        System.out.println("Phone 3: " + phone3.getBrand() + " " + phone3.getModel() + " with a price of $" + phone3.getPrice());
    }
}
