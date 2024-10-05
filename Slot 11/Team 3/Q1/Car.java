/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Car {
    private String model;
    private int year;
    
    public String getModel() {
        return model;
    }
    
    public void setModel (String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty");
        }
        this.model = model;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be a positive number");
        }
        this.year = year;
    }
}
