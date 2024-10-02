/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Car implements Vehicle {
    private String model;

    // Constructor to initialize model
    public Car(String model) {
        this.model = model;
    }

    // Method to start the engine
    public void startEngine() {
        // To be implemented
        System.out.println(model + " car's engine started.");
    }

    // Method to stop the engine
    public void stopEngine() {
        // To be implemented
        System.out.println(model + " car's engine stopped.");
    }
}
