/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Car extends Vehicle {
    // Add attribute for number of doors
    private int numberOfDoors;

    // Constructor to initialize all attributes, including those of the superclass
    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year); // Call the Vehicle class constructor
        this.numberOfDoors = numberOfDoors;
    }

    // Override the method to display car information
    @Override
    public void displayVehicleInfo() {
        System.out.println("Car Make: " + getMake() + " | Model: " + getModel() + " | Year: " + getYear() + " | Number of Doors: " + numberOfDoors);
    }

    // Getter for numberOfDoors (optional)
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
