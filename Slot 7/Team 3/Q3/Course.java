public class Course {
    // Attributes for courseName and credits
    private String courseName;
    private int credits;

    // Constructor to initialize the attributes
    public Course(String courseName, int credits) {
        this.courseName = courseName;
        this.credits = credits;
    }

    // Method to display course information
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName + " | Credits: " + credits);
    }

    // Getters (optional, if needed)
    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }
}
