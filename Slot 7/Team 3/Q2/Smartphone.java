/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Smartphone extends  Device{
    // Attribute for operating system
    private String operatingSystem;

    // Constructor to initialize all attributes, including those of the superclass
    public Smartphone(String brand, String model, String operatingSystem) {
        super(brand, model); // Call the Device class constructor
        this.operatingSystem = operatingSystem;
    }

    // Override the method to display smartphone information
    @Override
    public void displayDeviceInfo() {
        System.out.println("Smartphone: " + getBrand() + " " + getModel() + " | OS: " + operatingSystem);
    }

    // Getter for operatingSystem (optional)
    public String getOperatingSystem() {
        return operatingSystem;
    }
}
