/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

/**
 *
 * @author Asus
 */
public class Circle {
    // Static field for PI
    public static final double PI = 3.14159;
    
    // Non-static field for radius
    private double radius;
    
    // Constructor
    public Circle(double radius) {
        // Your code here
        this.radius = radius;
    }
    
    // Static method to calculate area
    public static double calculateArea(double radius) {
        // Your code here
        return radius * radius * PI;
    }
    
    // Non-static method to get area
    public double getArea() {
        // Your code here
        return radius * radius * PI;
    }
    
    public static void main(String[] args) {
        // Call static method to calculate area
        double staticArea = Circle.calculateArea(5.0);
        System.out.println("Static Method Area: " + staticArea);
        
        // Create an object of Circle class
        Circle circle1 = new Circle(5.0);
        
        // Call non-static method to calculate area
        System.out.println("Non-Static Method Area: " + circle1.getArea());
    }
}
