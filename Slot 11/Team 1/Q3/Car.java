/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Car extends Vehicle {
    private int numDoors;
    private boolean hasSunroof;

    // Getter for number of doors
    public int getNumDoors() {
        return numDoors;
    }

    // Setter for number of doors
    public void setNumDoors(int numDoors) {
        if (numDoors <= 0) {
            throw new IllegalArgumentException("Number of doors must be a positive number");
        }
        this.numDoors = numDoors;
    }

    // Check if the car has a sunroof
    public boolean hasSunroof() {
        return hasSunroof;
    }

    // Setter for sunroof
    public void setSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    // Override vehicleType method
    @Override
    public String vehicleType() {
        return "Car";
    }
}
