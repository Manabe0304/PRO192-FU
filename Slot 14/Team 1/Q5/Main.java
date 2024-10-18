/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Create a TreeSet to store songs
        TreeSet<Song> songLibrary = new TreeSet<>();

        // Add sample songs to the set
        songLibrary.add(new Song(1, "Bohemian Rhapsody", "Queen"));
        songLibrary.add(new Song(2, "Imagine", "John Lennon"));
        songLibrary.add(new Song(3, "Hotel California", "Eagles"));
        songLibrary.add(new Song(4, "Hey Jude", "The Beatles"));
        songLibrary.add(new Song(5, "Stairway to Heaven", "Led Zeppelin"));

        // Print all songs in the library
        System.out.println("Music Library:");
        for (Song song : songLibrary) {
            System.out.println(song);
        }

        // Check if a specific song exists
        System.out.println("\nIs 'Imagine' by John Lennon in the library? " +
                songLibrary.contains(new Song(2, "Imagine", "John Lennon")));

        // Remove a song and print the updated collection
        songLibrary.remove(new Song(2, "Imagine", "John Lennon"));
        System.out.println("\nUpdated Music Library:");
        for (Song song : songLibrary) {
            System.out.println(song);
        }
    }
}
