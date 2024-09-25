/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Create a Device object
        Device device = new Device("Samsung", "Galaxy Tab");
        
        // Create a Smartphone object
        Smartphone smartphone = new Smartphone("Apple", "iPhone 12", "iOS");
        
        // Call displayDeviceInfo method for the device
        device.displayDeviceInfo();
        
        // Call displayDeviceInfo method for the smartphone
        smartphone.displayDeviceInfo();
    }
}
