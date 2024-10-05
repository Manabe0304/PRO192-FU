/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Cylinder extends Circle {
   // TODO: Define fields: height (double), material (String)
   private double height;
   private String material;
   // TODO: Define constructors: Cylinder() and Cylinder(double radius, double height, String material)
   public Cylinder() {
      super(); 
      this.height = 1.0; 
      this.material = "metal"; 
   }
   
   public Cylinder(double radius, double height, String material) {
      super(radius);
      this.height = height;
      this.material = material;
   }
   // TODO: Override getSurfaceArea() to calculate total surface area of the cylinder
   public double getHeight() {
      return height;
   }

   public String getMaterial() {
      return material;
   }
   
   public double getSurfaceArea() {
      return 2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * getRadius() * getRadius();
   }
   // TODO: Define getVolume() method to calculate the volume of the cylinder
   public double getVolume() {
      return Math.PI * getRadius() * getRadius() * getHeight();
   }
   // Leave this class empty for now
}
