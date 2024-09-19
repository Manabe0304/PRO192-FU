/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
public class MathHelper {
    // Static field for E
    public static final double E = 2.71828;
    
    // Non-static field for number
    private double number;
    
    // Constructor
    public MathHelper(double number) {
        this.number = number;
    }
    
    // Static method to calculate square of a number
    public static double square(double number) {
        return number * number;
    }
    
    // Non-static method to calculate square of the object's number
    public double square() {
        return number * number;
    }
    
    public static void main(String[] args) {
        // Call static method to calculate square
        double staticSquare = MathHelper.square(3.0);
        System.out.println("Static Method Square: " + staticSquare);
        
        // Create an object of MathHelper class
        MathHelper helper = new MathHelper(3.0);
        
        // Call non-static method to calculate square
        System.out.println("Non-Static Method Square: " + helper.square());
    }
}
