/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Truck extends Vehicle {
    private int loadCapacity;
    private boolean hasTrailer;

    // Getter for load capacity
    public int getLoadCapacity() {
        return loadCapacity;
    }

    // Setter for load capacity
    public void setLoadCapacity(int loadCapacity) {
        if (loadCapacity <= 0) {
            throw new IllegalArgumentException("Load capacity must be a positive number");
        }
        this.loadCapacity = loadCapacity;
    }

    // Check if the truck has a trailer
    public boolean hasTrailer() {
        return hasTrailer;
    }

    // Setter for trailer
    public void setTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    // Override vehicleType method
    @Override
    public String vehicleType() {
        return "Truck";
    }
}
