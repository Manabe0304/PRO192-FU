    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team3;

/**
 *
 * @author Asus
 */
public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    
    public Movie (String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }
    
    public void play() {
        System.out.println("The moive '" + title + "' is now playing.");
    }
    
    public void pause() {
        System.out.println("The movie '" + title + "' has been paused.");
    }
    
    public String getDetails() {
        return ("Title: " + title + ", Director: " + director + ", Release year: " + releaseYear);
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
    
    public static void main(String[] args) {
        Movie myMovie = new Movie("Inception", "Christopher Nolan", 2010);
        
        myMovie.play();
        myMovie.pause();
        System.out.println(myMovie.getDetails());
    }
    
}
