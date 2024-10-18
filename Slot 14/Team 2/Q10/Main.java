/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList to store movies
        LinkedList<Movie> movieList = new LinkedList<>();

        // Add sample movies to the list
        movieList.add(new Movie(1, "Inception", "Christopher Nolan"));
        movieList.add(new Movie(2, "The Godfather", "Francis Ford Coppola"));
        movieList.add(new Movie(3, "The Dark Knight", "Christopher Nolan"));
        movieList.add(new Movie(4, "Pulp Fiction", "Quentin Tarantino"));
        movieList.add(new Movie(5, "The Shawshank Redemption", "Frank Darabont"));

        // Print all movies
        System.out.println("Movie List:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }

        // Retrieve and print the movie at index 2
        System.out.println("\nMovie at Index 2:");
        System.out.println(movieList.get(2));

        // Remove a movie at index 1 and print the updated list
        movieList.remove(1);
        System.out.println("\nUpdated Movie List:");
        for (Movie movie : movieList) {
            System.out.println(movie);
        }
    }
}
