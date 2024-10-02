    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Refrigerator implements Appliance{
    private String model;

    // Constructor to initialize model
    public Refrigerator(String model) {
        this.model = model;
    }

    // Method to turn on the refrigerator
    public void turnOn() {
        // To be implemented
        System.out.println(model + " refrigerator is now ON.");
    }

    // Method to turn off the refrigerator
    public void turnOff() {
        // To be implemented
        System.out.println(model + " refrigerator is now OFF.");
    }
}
