/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class DigitalCopy extends Media {
    private String director;
    private String releaseDate;
    private int duration;
    private double fileSize;

    public DigitalCopy(double price, String title, String genre, String director, String releaseDate, int duration, double fileSize) {
        super(price, title, genre);
        this.director = director;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.fileSize = fileSize;
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

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter director: ");
        this.director = scanner.nextLine();
        System.out.print("Enter release date: ");
        this.releaseDate = scanner.nextLine();
        System.out.print("Enter duration (in minutes): ");
        this.duration = scanner.nextInt();
        System.out.print("Enter file size (in GB): ");
        this.fileSize = scanner.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Release Date: " + releaseDate + ", Duration: " + duration + " mins, File Size: " + fileSize + " GB";
    }
}
