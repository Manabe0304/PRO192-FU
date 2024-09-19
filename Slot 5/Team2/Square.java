/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
public class Square {
    // Attribute
    private double side;
    
    // Constructor
    public Square(double side) {
        this.side = side;
    }
    
    // Accessor for side
    public double getSide() {
        return side;
    }
    
    // Mutator for side
    public void setSide(double side) {
        this.side = side;
    }
    
    // Method to calculate the area of the square
    public double getArea() {
        return side * side;
    }
    
    public static void main(String[] args) {
        // Create an object of Square class
        Square square = new Square(4.0);
        
        // Print initial area
        System.out.println("Initial Area: " + square.getArea());
        
        // Change the side of the square
        square.setSide(6.0);
        
        // Print the new area
        System.out.println("New Area: " + square.getArea());
    }
}
