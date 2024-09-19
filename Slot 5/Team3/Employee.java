/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

/**
 *
 * @author Asus
 */
import java.time.LocalDate;
import java.time.Period;

public class Employee {
    // Attributes
    private String name;
    private LocalDate dateOfHire;
    private String email;
    
    // Constructor
    public Employee(String name, LocalDate dateOfHire, String email) {
        this.name = name;
        this.dateOfHire = dateOfHire;
        this.email = email;
    }
    
    // Method to calculate years of service
    public int getYearsOfService() {
        return Period.between(this.dateOfHire, LocalDate.now()).getYears();
    }
    
    // Method to check if email is valid
    public boolean isValidEmail() {
        return this.email.contains("@");
    }
    
    public static void main(String[] args) {
        // Create an object of Employee class
        Employee employee1 = new Employee("John Smith", LocalDate.of(2015, 6, 15), "john.smith@company.com");
        
        // Print the employee's years of service
        System.out.println("Years of Service: " + employee1.getYearsOfService());
        
        // Check if the email is valid
        System.out.println("Is email valid? " + employee1.isValidEmail());
    }
}
