package Team1;

public class Rectangle {
    // Attributes
    private double length;
    private double width;
    
    // Constructor
    public Rectangle(double length, double width) {
        // Your code here
        this.length = length;
        this.width = width;
    }
    
    // Accessor for length
    public double getLength() {
        // Your code here
        return 0;
    }
    
    // Accessor for width
    public double getWidth() {
        // Your code here
        return 0;
    }
    
    // Mutator for length
    public void setLength(double length) {
        // Your code here
        if (length > 0) {
            this.length = length;
        }
    }
    
    // Mutator for width
    public void setWidth(double width) {
        // Your code here
        if (width > 0) {
            this.width = width;
        }
    }
    
    // Method to calculate the area of the rectangle
    public double getArea() {
        // Your code here
        return length * width;
    }
    
    public static void main(String[] args) {
        // Create an object of Rectangle class
        Rectangle rect = new Rectangle(5.0, 3.0);
        
        // Print initial area
        System.out.println("Initial Area: " + rect.getArea());
        
        // Change the dimensions of the rectangle
        rect.setLength(7.0);
        rect.setWidth(4.0);
        
        // Print the new area
        System.out.println("New Area: " + rect.getArea());
    }
}
