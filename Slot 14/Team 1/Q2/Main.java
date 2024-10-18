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
        // Create a HashSet to store students
        HashSet<Student> studentSet = new HashSet<>();

        // Add sample students to the set
        studentSet.add(new Student(1, "Alice"));
        studentSet.add(new Student(2, "Bob"));
        studentSet.add(new Student(3, "Charlie"));
        studentSet.add(new Student(4, "Diana"));
        studentSet.add(new Student(2, "Bob")); // Duplicate ID to test uniqueness

        // Print all students
        System.out.println("Registered Students:");
        for (Student student : studentSet) {
            System.out.println(student);
        }

        // Check if a specific student exists
        System.out.println("\nIs student with ID 3 registered? " +
                studentSet.contains(new Student(3, "Charlie")));

        // Remove a student and print the updated list
        studentSet.remove(new Student(2, "Bob"));
        System.out.println("\nUpdated Student List:");
        for (Student student : studentSet) {
            System.out.println(student);
        }
    }
}
