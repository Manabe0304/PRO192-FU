/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Objects;

public class Student {
    // Fields
    private int studentId;
    private String studentName;

    // Constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Override toString method to return student details
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName;
    }

    // Override equals to check for duplicate students by ID
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId;
    }

    // Override hashCode to ensure correct behavior in HashSet
    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }
}
