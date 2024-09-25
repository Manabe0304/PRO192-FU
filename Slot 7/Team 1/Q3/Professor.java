/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Professor extends Person {
    // Attribute for department
    private String department;

    // Constructor to initialize all attributes, including those of the superclass
    public Professor(String name, int age, String department) {
        super(name, age); // Call the Person class constructor
        this.department = department;
    }

    // Override the method to display professor information
    @Override
    public void displayInfo() {
        System.out.println("Professor Name: " + getName() + " | Age: " + getAge() + " | Department: " + department);
    }

    // Getter for department (optional)
    public String getDepartment() {
        return department;
    }
}
