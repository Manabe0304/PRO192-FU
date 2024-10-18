/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Movie {
    private int movieId;
    private String title;
    private String director;

    // Constructor
    public Movie(int movieId, String title, String director) {
        this.movieId = movieId;
        this.title = title;
        this.director = director;
    }

    // Getter for movieId
    public int getMovieId() {
        return movieId;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for director
    public String getDirector() {
        return director;
    }

    // Override toString to display movie details
    @Override
    public String toString() {
        return "Movie ID: " + movieId + ", Title: " + title + ", Director: " + director;
    }
}
