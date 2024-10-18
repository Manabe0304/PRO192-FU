/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store employee details
        HashMap<Integer, String> employeeMap = new HashMap<>();

        // Add sample employees to the map
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "Diana");
        employeeMap.put(105, "Eve");

        // Print all employees
        System.out.println("Employee Details:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Retrieve and print the name of an employee with a specific ID
        System.out.println("\nEmployee with ID 103: " + employeeMap.get(103));

        // Remove an employee by ID and print the updated list
        employeeMap.remove(102);
        System.out.println("\nUpdated Employee List:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
