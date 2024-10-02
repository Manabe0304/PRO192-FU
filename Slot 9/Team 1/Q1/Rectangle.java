/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Rectangle implements Shape {
    private double width;
    private double height;

    // Constructor to initialize width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    public double calculateArea() {
        // To be implemented
        return width * height;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        // To be implemented
        return 2 * (width + height);
    }
}
