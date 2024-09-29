/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Circle {
   // TODO: Define fields: radius (double), color (String)
    private double radius;
    private String color;
   // TODO: Define constructors: Circle() and Circle(double radius)
    public Circle() {
        this.radius = 1.0;
        this.color = "red"; 
    }

   public Circle(double radius) {
      this.radius = radius;
      this.color = "red"; // Default color
   }
   // TODO: Define getArea() method
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    
    public double getArea() {
      return Math.PI * getRadius() * getRadius();
    }
   // Leave this class empty for now
}
