/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Vehicle {
    // Attributes for make, model, and year
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the attributes
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle information
    public void displayVehicleInfo() {
        System.out.println("Vehicle Make: " + make + " | Model: " + model + " | Year: " + year);
    }

    // Getters (optional, if needed)
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
