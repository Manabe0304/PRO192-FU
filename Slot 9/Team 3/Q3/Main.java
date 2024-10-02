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
        // Create a Smartphone object and call deviceInfo
        Smartphone smartphone = new Smartphone();
        smartphone.deviceInfo();  // Should print "This is a smartphone."

        // Create a Laptop object and call deviceInfo
        Laptop laptop = new Laptop();
        laptop.deviceInfo();  // Should print "This is a generic device."
    }
}
