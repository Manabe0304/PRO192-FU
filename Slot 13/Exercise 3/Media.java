/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
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
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        }
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (!genre.isEmpty()) {
            this.genre = genre;
        }
    }

    public void inputDetails() {
      // Implementation of inputDetails() method
    }
    
    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Price: $" + price;
    }

    Object getReleaseDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
