package Team1;

public class Calculator {
    // Attributes
    private double a;
    private double b;
    
    // Constructor with no parameters
    public Calculator() {
        // Your code here (set default values)
        this.a = 0;
        this.b = 0;
    }
    
    // Constructor with parameters
    public Calculator(double a, double b) {
        // Your code here
        this.a = a;
        this.b = b;
    }
    
    // Method add with no parameters (returns sum of default values)
    public double add() {
        // Your code here
        return a + b;
    }
    
    // Method add with parameters (returns sum of a and b)
    public double add(double a, double b) {
        // Your code here
        return a + b;
    }
    
    public static void main(String[] args) {
        // Create an object using the constructor with no parameters
        Calculator calc1 = new Calculator();
        System.out.println("Sum (no parameters): " + calc1.add());
        
        // Create an object using the constructor with parameters
        Calculator calc2 = new Calculator(5.0, 3.0);
        System.out.println("Sum (with parameters): " + calc2.add(5.0, 3.0));
    }
}
