/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Motorcycle implements Vehicle {
    private String brand;

    // Constructor to initialize brand
    public Motorcycle(String brand) {
        this.brand = brand;
    }

    // Method to start the engine
    public void startEngine() {
        // To be implemented
        System.out.println(brand + " motorcycle's engine started.");
    }

    // Method to stop the engine
    public void stopEngine() {
        // To be implemented
        System.out.println(brand + " motorcycle's engine stopped.");
    }
}
