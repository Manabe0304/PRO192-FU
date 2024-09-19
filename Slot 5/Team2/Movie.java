/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
public class Movie {
    // Attributes
    private String title;
    private String director;
    private double duration;
    
    // Constructor with parameters
    public Movie(String title, String director, double duration) {
        // Your code here
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    
    // Default constructor
    public Movie() {
        // Your code here
        this.title = "Your Name";
        this.director = "Shinkai Makoto";
        this.duration = 8.5;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public double getDuration() {
        return duration;
    }
    
    public static void main(String[] args) {
        // Create an object using parameterized constructor
        Movie movie1 = new Movie("Inception", "Christopher Nolan", 2.8);
        
        // Create an object using default constructor
        Movie movie2 = new Movie();
        
        // Print details of the movies (Hint: you can use getters to access private fields)
        // Your code here
        System.out.println("Movie 1: " + movie1.getTitle() + ", director by " + movie1.getDirector() + ", with a duration of " + movie1.getDuration());
        System.out.println("Movie 2: " + movie2.getTitle() + ", director by " + movie2.getDirector() + ", with a duration of " + movie2.getDuration());
    }
}
