/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Course {
    private int courseId;
    private String courseName;
    private String instructor;

    // Constructor
    public Course(int courseId, String courseName, String instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    // Getter for courseId
    public int getCourseId() {
        return courseId;
    }

    // Getter for courseName
    public String getCourseName() {
        return courseName;
    }

    // Getter for instructor
    public String getInstructor() {
        return instructor;
    }

    // Override toString to display course details
    @Override
    public String toString() {
        return "Course Name: " + courseName + ", Instructor: " + instructor;
    }
}
