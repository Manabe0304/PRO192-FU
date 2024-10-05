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
        // Test case for Car
        System.out.println("Sample 1: Car Test Case");
        Car car = new Car();
        car.setLicensePlate("ABC123");
        car.setWeight(1500);
        car.setNumDoors(4);
        car.setYearOfProduction(2020);
        car.setSunroof(true);

        System.out.println("Test getLicensePlate(): " + car.getLicensePlate());
        System.out.println("Test getWeight(): " + car.getWeight());
        System.out.println("Test getNumDoors(): " + car.getNumDoors());
        System.out.println("Test getYearOfProduction(): " + car.getYearOfProduction());
        System.out.println("Test hasSunroof(): " + car.hasSunroof());
        System.out.println("Test vehicleType(): " + car.vehicleType());

        // Test case for Truck
        System.out.println("\nSample 2: Truck Test Case");
        Truck truck = new Truck();
        truck.setLicensePlate("XYZ789");
        truck.setWeight(3000);
        truck.setLoadCapacity(5000);
        truck.setYearOfProduction(2018);
        truck.setTrailer(true);

        System.out.println("Test getLicensePlate(): " + truck.getLicensePlate());
        System.out.println("Test getWeight(): " + truck.getWeight());
        System.out.println("Test getLoadCapacity(): " + truck.getLoadCapacity());
        System.out.println("Test getYearOfProduction(): " + truck.getYearOfProduction());
        System.out.println("Test hasTrailer(): " + truck.hasTrailer());
        System.out.println("Test vehicleType(): " + truck.vehicleType());
    }
}
