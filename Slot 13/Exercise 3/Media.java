/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Media {
    private double price;
    private String title;
    private String genre;

    public Media(double price, String title, String genre) {
        this.price = price;
        this.title = title;
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be empty.");
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (!genre.isEmpty()) {
            this.genre = genre;
        } else {
            System.out.println("Genre cannot be empty.");
        }
    }

    public void inputDetails() {
      // Implementation of inputDetails() method
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the title: ");
        String title = scanner.nextLine();

        System.out.print("Enter the genre: ");
        String genre = scanner.nextLine();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
    }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Price: $" + price;
    }
}
