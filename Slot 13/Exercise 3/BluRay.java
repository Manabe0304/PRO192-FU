/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class BluRay extends Media {
    private String director;
    private String releaseDate;
    private int duration;
    private String resolution;

    public BluRay(double price, String title, String genre, String director, String releaseDate, int duration, String resolution) {
        super(price, title, genre);
        this.director = director;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.resolution = resolution;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public void inputDetails() {
        super.inputDetails(); // Call Media's inputDetails()
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter director: ");
        this.director = scanner.nextLine();
        System.out.print("Enter release date: ");
        this.releaseDate = scanner.nextLine();
        System.out.print("Enter duration (in minutes): ");
        this.duration = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter resolution (e.g., 1080p, 4K): ");
        this.resolution = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Release Date: " + releaseDate + ", Duration: " + duration + " mins, Resolution: " + resolution;
    }
}
