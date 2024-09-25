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
        // Create a Vehicle object
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2015);
        
        // Create a Car object
        Car car = new Car("Honda", "Civic", 2020, 4);
        
        // Display information of the vehicle
        vehicle.displayVehicleInfo();
        
        // Display information of the car
        car.displayVehicleInfo();
    }
}
