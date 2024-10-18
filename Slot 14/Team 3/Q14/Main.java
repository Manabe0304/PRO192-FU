/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Create a HashSet to store employee attendance
        HashSet<Employee> attendanceSet = new HashSet<>();

        // Add sample employees to the set
        attendanceSet.add(new Employee(1, "Alice"));
        attendanceSet.add(new Employee(2, "Bob"));
        attendanceSet.add(new Employee(3, "Charlie"));
        attendanceSet.add(new Employee(4, "Diana"));
        attendanceSet.add(new Employee(2, "Bob")); // Duplicate entry

        // Print all employees present
        System.out.println("Attendance List:");
        for (Employee employee : attendanceSet) {
            System.out.println(employee);
        }

        // Check if a specific employee is present
        System.out.println("\nIs 'Charlie' present? " +
                attendanceSet.contains(new Employee(3, "Charlie")));

        // Remove an employee and print the updated list
        attendanceSet.remove(new Employee(2, "Bob"));
        System.out.println("\nUpdated Attendance List:");
        for (Employee employee : attendanceSet) {
            System.out.println(employee);
        }
    }
}
