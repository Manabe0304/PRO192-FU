/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team1;

public class Rectangle2 {
    // Attributes
    private double length;
    private double width;
    
    // Constructor
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Non-static method to calculate area
    public double getArea() {
        // Your code here
        return length * width;
    }
    
    // Non-static method to calculate perimeter
    public double getPerimeter() {
        // Your code here
        return 2 * (length + width);
    }
    
    // Static method to compare areas of two rectangles
    public static Rectangle2 compareArea(Rectangle2 r1, Rectangle2 r2) {
        // Your code here
        if (r1.getArea() > r2.getArea()) {
            return r1;
        } else {
            return r2;
        }
    }
    
    public static void main(String[] args) {
        // Create two Rectangle objects
        Rectangle2 rect1 = new Rectangle2(5.0, 3.0);
        Rectangle2 rect2 = new Rectangle2(6.0, 2.5);
        
        // Print areas and perimeters
        System.out.println("Area of rect1: " + rect1.getArea());
        System.out.println("Perimeter of rect1: " + rect1.getPerimeter());
        
        System.out.println("Area of rect2: " + rect2.getArea());
        System.out.println("Perimeter of rect2: " + rect2.getPerimeter());
        
        // Compare areas of the two rectangles
        Rectangle2 largerRectangle = Rectangle2.compareArea(rect1, rect2);
        System.out.println("The rectangle with the larger area has dimensions: " +
                           largerRectangle.length + " x " + largerRectangle.width);
    }
}
