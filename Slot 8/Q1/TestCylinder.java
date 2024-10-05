/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class TestCylinder {
   public static void main(String[] args) {
      // Test 1: Default Cylinder
      Cylinder c1 = new Cylinder();
      System.out.println("Cylinder 1: radius=" + c1.getRadius() + ", height=" + c1.getHeight()
                         + ", material=" + c1.getMaterial() + ", surface area=" + c1.getSurfaceArea()
                         + ", volume=" + c1.getVolume());

      // Test 2: Cylinder with specific radius, height, and material
      Cylinder c2 = new Cylinder(3.0, 5.0, "plastic");
      System.out.println("Cylinder 2: radius=" + c2.getRadius() + ", height=" + c2.getHeight()
                         + ", material=" + c2.getMaterial() + ", surface area=" + c2.getSurfaceArea()
                         + ", volume=" + c2.getVolume());
   }
}
