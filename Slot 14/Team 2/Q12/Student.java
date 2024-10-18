/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Student {
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

    // Override toString to display student details
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName;
    }
}
