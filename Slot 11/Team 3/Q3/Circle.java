/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Circle extends Shape implements Drawable {
    private double radius;

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius with validation
    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number");
        }
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the perimeter of the circle
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // Method to draw the circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius + " and color: " + getColor());
    }
}
