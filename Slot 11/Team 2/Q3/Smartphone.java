/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Smartphone extends Device implements Connectable {
    private double screenSize;

    // Getter for screenSize
    public double getScreenSize() {
        return screenSize;
    }

    // Setter for screenSize with validation
    public void setScreenSize(double screenSize) {
        if (screenSize <= 0) {
            throw new IllegalArgumentException("Screen size must be a positive number");
        }
        this.screenSize = screenSize;
    }

    // Method to display device information
    @Override
    public void deviceInfo() {
        System.out.println("Smartphone Info: " + getBrand() + " " + getModel() + ", Screen Size: " + screenSize + " inches");
    }

    // Method to connect the smartphone
    @Override
    public void connect() {
        System.out.println("Connecting the smartphone...");
    }

    // Method to disconnect the smartphone
    @Override
    public void disconnect() {
        System.out.println("Disconnecting the smartphone...");
    }
}
