/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public abstract class Device {
    private String brand;
    private String model;

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand with validation
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
        this.brand = brand;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model with validation
    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
    }

    // Abstract method to display device information
    public abstract void deviceInfo();
}
