/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

/**
 *
 * @author Asus
 */
public class Rectangle {
    // Static field for shape name
    public static final String shapeName = "Rectangle";
    
    // Non-static fields for length and width
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Static method to calculate the area of a rectangle
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Non-static method to calculate the area of the rectangle
    public double getArea() {
        return this.length * this.width;
    }
    
    public static void main(String[] args) {
        // Call static method to calculate area
        double staticArea = Rectangle.calculateArea(4.0, 5.0);
        System.out.println("Static Method Area: " + staticArea);
        
        // Create an object of Rectangle class
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        
        // Call non-static method to calculate area
        System.out.println("Non-Static Method Area: " + rectangle.getArea());
        
        // Print the shape name
        System.out.println("Shape: " + Rectangle.shapeName);
    }
}
