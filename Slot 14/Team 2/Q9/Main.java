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
        // Create a HashMap to store courses
        HashMap<Integer, Course> courseMap = new HashMap<>();

        // Add sample courses to the map
        courseMap.put(101, new Course(101, "Java Programming", "John Doe"));
        courseMap.put(102, new Course(102, "Data Structures", "Alice Johnson"));
        courseMap.put(103, new Course(103, "Web Development", "Bob Smith"));
        courseMap.put(104, new Course(104, "Database Systems", "Charlie Brown"));
        courseMap.put(105, new Course(105, "Operating Systems", "Diana Prince"));

        // Print all courses
        System.out.println("Courses List:");
        for (Map.Entry<Integer, Course> entry : courseMap.entrySet()) {
            System.out.println("Course ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }

        // Retrieve and print the details of a course by its ID
        System.out.println("\nDetails of Course ID 103:");
        System.out.println(courseMap.get(103));

        // Remove a course by its ID and print the updated list
        courseMap.remove(102);
        System.out.println("\nUpdated Courses List:");
        for (Map.Entry<Integer, Course> entry : courseMap.entrySet()) {
            System.out.println("Course ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
}
