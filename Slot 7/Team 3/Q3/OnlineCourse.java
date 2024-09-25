/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class OnlineCourse extends Course {
    // Attribute for platform
    private String platform;

    // Constructor to initialize all attributes, including those of the superclass
    public OnlineCourse(String courseName, int credits, String platform) {
        super(courseName, credits); // Call the Course class constructor
        this.platform = platform;
    }

    // Override the method to display online course information
    @Override
    public void displayCourseInfo() {
        System.out.println("Online Course: " + getCourseName() + " | Credits: " + getCredits() + " | Platform: " + platform);
    }

    // Getter for platform (optional)
    public String getPlatform() {
        return platform;
    }
}
