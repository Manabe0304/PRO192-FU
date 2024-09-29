/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Point2D {
   // TODO: Define fields: x (float), y (float)
   private float x;
   private float y;
   // TODO: Define constructors: Point2D() and Point2D(float x, float y)
   public Point2D() {
      this.x = 0.0f;
      this.y = 0.0f;
   }
   
   public Point2D(float x, float y) {
      this.x = x;
      this.y = y;
   }
   // TODO: Define getXY() and setXY(float x, float y)
   public float[] getXY() {
      return new float[] {x, y};
   }
   
   public void setXY(float x, float y) {
      this.x = x;
      this.y = y;
   }
   // TODO: Define distanceTo(Point2D other) to calculate 2D distance
   public double distanceTo(Point2D other) {
      float dx = other.x - this.x;
      float dy = other.y - this.y;
      return Math.sqrt(dx * dx + dy * dy);
   }
   // TODO: Define midpointTo(Point2D other) to calculate 2D midpoint
   public Point2D midpointTo(Point2D other) {
      float midX = (this.x + other.x) / 2;
      float midY = (this.y + other.y) / 2;
      return new Point2D(midX, midY);
   }
   
   @Override
   public String toString() {
      return "(" + x + ", " + y + ")";
   }
   // Leave this class empty for now
}
