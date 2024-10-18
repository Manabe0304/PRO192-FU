/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap to store student grades
        TreeMap<Integer, String> studentGrades = new TreeMap<>();

        // Add sample students and their grades to the map
        studentGrades.put(101, "A");
        studentGrades.put(102, "B+");
        studentGrades.put(103, "A-");
        studentGrades.put(104, "B");
        studentGrades.put(105, "C");

        // Print all students and their grades
        System.out.println("Student Grades:");
        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // Retrieve and print the grade of a specific student by ID
        System.out.println("\nGrade of Student ID 103: " + studentGrades.get(103));

        // Update the grade of a student and print the updated map
        studentGrades.replace(102, "A");
        System.out.println("\nUpdated Student Grades:");
        for (Map.Entry<Integer, String> entry : studentGrades.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Grade: " + entry.getValue());
        }
    }
}
