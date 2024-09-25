/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Create a Course object
        Course course = new Course("Data Structures", 4);
        
        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Algorithms", 3, "Coursera");
        
        // Call displayCourseInfo method for the course
        course.displayCourseInfo();
        
        // Call displayCourseInfo method for the online course
        onlineCourse.displayCourseInfo();
    }
}
