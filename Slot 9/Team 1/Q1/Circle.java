/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Circle implements Shape {
    private double radius;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double calculateArea() {
        // To be implemented
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        // To be implemented
        return 2 * Math.PI * radius;
    }
}
