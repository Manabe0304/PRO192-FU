package Team1;

public class Employee {
    // Private fields
    private String name;
    private String position;
    private double salary;
    
    // Constructor
    public Employee(String name, String position, double salary) {
        // Your code here
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    
    // Getter for name
    public String getName() {
        // Your code here
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        // Your code here
        this.name = name;
    }
    
    // Getter for position
    public String getPosition() {
        // Your code here
        return position;
    }
    
    // Setter for position
    public void setPosition(String position) {
        // Your code here
        this.position = position;
    }
    
    // Getter for salary
    public double getSalary() {
        // Your code here
        return salary;
    }
    
    // Setter for salary
    public void setSalary(double salary) {
        // Your code here
        if (salary > 0) {
            this.salary = salary;
        }
    }
    
    // Method to give a raise
    public void giveRaise(double amount) {
        // Your code here
        if (amount > 0) {
            this.salary += amount;
        } else {
            System.out.println("Raise amount must be positive.");
        }
    }
    
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Alice", "Developer", 50000);
        
        // Set new values using setters
        emp.setName("Bob");
        emp.setPosition("Manager");
        emp.setSalary(60000);
        
        // Give the employee a raise
        emp.giveRaise(5000);
        
        // Print the updated details using getters
        System.out.println("Name: " + emp.getName());
        System.out.println("Position: " + emp.getPosition());
        System.out.println("Salary: " + emp.getSalary());
    }
}
