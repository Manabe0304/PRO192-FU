/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

/**
 *
 * @author Asus
 */
public class Car {
        // Attributes
    private String brand;
    private String model;
    private int year;
    
    // Constructor with all parameters
    public Car(String brand, String model, int year) {
        // Your code here
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    // Constructor with brand and model
    public Car(String brand, String model) {
        // Your code here
        this.brand = brand;
        this.model = model;
        this.year = 2016;
    }
    
    // Constructor with only brand
    public Car(String brand) {
        this.brand = brand;
        this.model = "Everest";
        this.year = 2018;
    }
    
    public static void main(String[] args) {
        // Create an object using constructor with all parameters
        Car car1 = new Car("Toyota", "Camry", 2021);
        
        // Create an object using constructor with brand and model
        Car car2 = new Car("Honda", "Civic");
        
        // Create an object using constructor with only brand
        Car car3 = new Car("Ford");
        
        // Print details of the cars (Hint: you can use getters to access private fields)
        // Your code here
        System.out.println("Brand: " + car1.brand + ", Model: " + car1.model + ", Year: " + car1.year );
        System.out.println("Brand: " + car2.brand + ", Model: " + car2.model + ", Year: " + car2.year );
        System.out.println("Brand: " + car3.brand + ", Model: " + car3.model + ", Year: " + car3.year );
    }
}
