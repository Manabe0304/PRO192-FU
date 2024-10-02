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
        // Call the static method to calculate power for 220V and 5A
        double power1 = PowerCalculator.calculatePower(220, 5);
        System.out.println("Power for 220V and 5A: " + power1 + " watts");

        // Call the static method to calculate power for 110V and 2A
        double power2 = PowerCalculator.calculatePower(110, 2);
        System.out.println("Power for 110V and 2A: " + power2 + " watts");
    }
}
