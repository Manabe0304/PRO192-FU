/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public abstract class Vehicle {
    private String licensePlate;
    private int weight;
    private int yearOfProduction;

    // Getter for license plate
    public String getLicensePlate() {
        return licensePlate;
    }

    // Setter for license plate
    public void setLicensePlate(String licensePlate) {
        if (licensePlate == null || licensePlate.trim().isEmpty()) {
            throw new IllegalArgumentException("License plate cannot be null or empty");
        }
        this.licensePlate = licensePlate;
    }

    // Getter for weight
    public int getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(int weight) {
        if (weight <= 0) {
            throw new IllegalArgumentException("Weight must be a positive number");
        }
        this.weight = weight;
    }

    // Getter for year of production
    public int getYearOfProduction() {
        return yearOfProduction;
    }

    // Setter for year of production
    public void setYearOfProduction(int yearOfProduction) {
        if (yearOfProduction <= 0) {
            throw new IllegalArgumentException("Year of production must be a positive number");
        }
        this.yearOfProduction = yearOfProduction;
    }

    // Abstract method for vehicle type
    public abstract String vehicleType();
}
