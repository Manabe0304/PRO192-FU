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
        // Create a WashingMachine object with brand "LG"
        WashingMachine washingMachine = new WashingMachine("LG");

        // Create a Refrigerator object with model "Samsung"
        Refrigerator refrigerator = new Refrigerator("Samsung");

        // Turn on and off the washing machine
        washingMachine.turnOn();
        washingMachine.turnOff();

        // Turn on and off the refrigerator
        refrigerator.turnOn();
        refrigerator.turnOff();
    }
}
