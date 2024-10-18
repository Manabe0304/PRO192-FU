/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Song implements Comparable<Song> {
    // Fields
    private int songId;
    private String songTitle;
    private String artist;

    // Constructor
    public Song(int songId, String songTitle, String artist) {
        this.songId = songId;
        this.songTitle = songTitle;
        this.artist = artist;
    }

    // Getter for songId
    public int getSongId() {
        return songId;
    }

    // Getter for songTitle
    public String getSongTitle() {
        return songTitle;
    }

    // Getter for artist
    public String getArtist() {
        return artist;
    }

    // Override toString method to return song details
    @Override
    public String toString() {
        return "Song ID: " + songId + ", Title: " + songTitle + ", Artist: " + artist;
    }

    // Implement compareTo to compare songs by title
    @Override
    public int compareTo(Song other) {
        return this.songTitle.compareTo(other.songTitle);
    }

    // Override equals and hashCode to allow comparison based on songId, songTitle, and artist
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Song song = (Song) obj;
        return songId == song.songId && songTitle.equals(song.songTitle) && artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        return songTitle.hashCode() + artist.hashCode() + songId;
    }
}
