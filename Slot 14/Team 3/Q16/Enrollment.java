/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Enrollment {
    // Fields
    private int enrollmentId;
    private String studentName;
    private String courseName;

    // Constructor
    public Enrollment(int enrollmentId, String studentName, String courseName) {
        this.enrollmentId = enrollmentId;
        this.studentName = studentName;
        this.courseName = courseName;
    }

    // Getter for enrollmentId
    public int getEnrollmentId() {
        return enrollmentId;
    }

    // Getter for studentName
    public String getStudentName() {
        return studentName;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // toString method to print enrollment details
    @Override
    public String toString() {
        return "Enrollment ID: " + enrollmentId + ", Student: " + studentName + ", Course: " + courseName;
    }
}
