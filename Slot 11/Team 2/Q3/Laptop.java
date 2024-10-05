/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Laptop extends Device implements Connectable {
    private int batteryLife;

    // Getter for batteryLife
    public int getBatteryLife() {
        return batteryLife;
    }

    // Setter for batteryLife with validation
    public void setBatteryLife(int batteryLife) {
        if (batteryLife <= 0) {
            throw new IllegalArgumentException("Battery life must be a positive number");
        }
        this.batteryLife = batteryLife;
    }

    // Method to display device information
    @Override
    public void deviceInfo() {
        System.out.println("Laptop Info: " + getBrand() + " " + getModel() + ", Battery Life: " + batteryLife + " hours");
    }

    // Method to connect the laptop
    @Override
    public void connect() {
        System.out.println("Connecting the laptop...");
    }

    // Method to disconnect the laptop
    @Override
    public void disconnect() {
        System.out.println("Disconnecting the laptop...");
    }
}
