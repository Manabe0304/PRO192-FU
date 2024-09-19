/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

/**
 *
 * @author Asus
 */
public class Circle {
    // Attribute
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Accessor for radius
    public double getRadius() {
        return radius;
    }
    
    // Mutator for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Method to calculate the area of the circle
    public double getArea() {
        return 3.14159 * radius * radius;
    }
    
    public static void main(String[] args) {
        // Create an object of Circle class
        Circle circle = new Circle(5.0);
        
        // Print initial area
        System.out.println("Initial Area: " + circle.getArea());
        
        // Change the radius of the circle
        circle.setRadius(7.0);
        
        // Print the new area
        System.out.println("New Area: " + circle.getArea());
    }
}
