/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store enrollments
        ArrayList<Enrollment> enrollments = new ArrayList<>();

        // Add sample enrollments to the list
        enrollments.add(new Enrollment(1, "Alice", "Math"));
        enrollments.add(new Enrollment(2, "Bob", "Science"));
        enrollments.add(new Enrollment(3, "Charlie", "History"));
        enrollments.add(new Enrollment(4, "Diana", "Art"));
        enrollments.add(new Enrollment(5, "Eve", "Computer Science"));

        // Print all enrollments
        System.out.println("Enrollments:");
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }

        // Retrieve and print the enrollment at index 2
        System.out.println("\nEnrollment at Index 2:");
        System.out.println(enrollments.get(2));

        // Remove an enrollment at index 1 and print the updated list
        enrollments.remove(1);
        System.out.println("\nUpdated Enrollments:");
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }
}
