    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Arrays;

public class TestPoint {
   public static void main(String[] args) {
      // Test 1: Create two Point2D objects and calculate distance and midpoint
      Point2D p2d1 = new Point2D(1.0f, 2.0f);
      Point2D p2d2 = new Point2D(4.0f, 6.0f);
      System.out.println("Distance between Point2D: " + p2d1.distanceTo(p2d2)); // Expected Output: Distance calculated
      System.out.println("Midpoint between Point2D: " + p2d1.midpointTo(p2d2)); // Expected Output: Midpoint calculated

      // Test 2: Create two Point3D objects and calculate distance and midpoint
      Point3D p3d1 = new Point3D(1.0f, 2.0f, 3.0f);
      Point3D p3d2 = new Point3D(4.0f, 6.0f, 8.0f);
      System.out.println("Distance between Point3D: " + p3d1.distanceTo(p3d2)); // Expected Output: 3D Distance calculated
      System.out.println("Midpoint between Point3D: " + p3d1.midpointTo(p3d2)); // Expected Output: 3D Midpoint calculated
   }
}
