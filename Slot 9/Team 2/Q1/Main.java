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
        // Create a Car object with model "Sedan"
        Car car = new Car("Sedan");

        // Create a Motorcycle object with brand "Harley"
        Motorcycle motorcycle = new Motorcycle("Harley");

        // Start and stop the engine of the car
        car.startEngine();
        car.stopEngine();

        // Start and stop the engine of the motorcycle
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
