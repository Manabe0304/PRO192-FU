/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Point3D extends Point2D {
   // TODO: Define field: z (float)
   private float z;
   // TODO: Define constructors: Point3D() and Point3D(float x, float y, float z)
   public Point3D() {
      super();
      this.z = 0.0f;
   }
   
   public Point3D(float x, float y, float z) {
      super(x, y); // Call the Point2D constructor with parameters
      this.z = z;
   }
   // TODO: Define getXYZ() and setXYZ(float x, float y, float z)
   public float[] getXYZ() {
      return new float[] {getXY()[0], getXY()[1], z};
   }
   
   public void setXYZ(float x, float y, float z) {
      setXY(x, y); // Use the setXY method from Point2D
      this.z = z;
   }
   // TODO: Define distanceTo(Point3D other) to calculate 3D distance
   public double distanceTo(Point3D other) {
      float dx = other.getXY()[0] - getXY()[0];
      float dy = other.getXY()[1] - getXY()[1];
      float dz = other.z - this.z;
      return Math.sqrt(dx * dx + dy * dy + dz * dz);
   }
   // TODO: Define midpointTo(Point3D other) to calculate 3D midpoint
   public Point3D midpointTo(Point3D other) {
      float midX = (getXY()[0] + other.getXY()[0]) / 2;
      float midY = (getXY()[1] + other.getXY()[1]) / 2;
      float midZ = (this.z + other.z) / 2;
      return new Point3D(midX, midY, midZ);
   }
   
   public String toString() {
      return "(" + getXY()[0] + ", " + getXY()[1] + ", " + z + ")";
   }
   // Leave this class empty for now
}
