/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class WashingMachine implements Appliance{
    private String brand;

    // Constructor to initialize brand
    public WashingMachine(String brand) {
        this.brand = brand;
    }

    // Method to turn on the washing machine
    public void turnOn() {
        // To be implemented
        System.out.println(brand + " washing machine is now ON.");
    }

    // Method to turn off the washing machine
    public void turnOff() {
        // To be implemented
        System.out.println(brand + " washing machine is now OFF.");
    }
}
