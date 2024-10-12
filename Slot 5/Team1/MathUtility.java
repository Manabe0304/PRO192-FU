package Team1;

public class MathUtility {
    // Static field for PI
    public static final double PI = 3.14159;
    
    // Static method to calculate the area of a circle
    public static double circleArea(double radius) {
        // Your code here
        return radius * radius * PI;
    }
    
    // Static method to calculate the circumference of a circle
    public static double circleCircumference(double radius) {
        // Your code here
        return 2 * radius * PI;
    }
    
    public static void main(String[] args) {
        // Calculate the area of a circle with radius 5
        double area = MathUtility.circleArea(5.0);
        System.out.println("Circle Area: " + area);
        
        // Calculate the circumference of a circle with radius 5
        double circumference = MathUtility.circleCircumference(5.0);
        System.out.println("Circle Circumference: " + circumference);
    }
}
