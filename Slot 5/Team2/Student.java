/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
import java.time.LocalDate;
import java.time.Period;

public class Student {
     // Attributes
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    
    // Constructor
    public Student(String name, LocalDate dateOfBirth, String email) {
        // Your code here
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }
    
    // Method to calculate age
    public int getAge() {
        // Your code here
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
    
    // Method to check if email is valid
    public boolean isValidEmail() {
        // Your code here
        if (email != null && email.contains("@")) {
            String[] parts = email.split("@");
            if (parts.length == 2 && parts[1].contains(".")) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        // Create an object of Student class
        Student student1 = new Student("Jane Doe", LocalDate.of(2000, 3, 21), "jane.doe@example.com");
        
        // Print the student's age
        System.out.println("Age: " + student1.getAge());
        
        // Check if the email is valid
        System.out.println("Is email valid? " + student1.isValidEmail());
    }
}
