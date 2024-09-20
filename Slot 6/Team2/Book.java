/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
    
    public void open() {
        System.out.println("The book '" + title + "' has been opened");
    }
    
    public void close() {
        System.out.println("The book '" + title + "' has been closed");
    }
    
    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Year Published: " + yearPublished;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
    
    public static void main(String[] args) {
        Book book = new Book( "Effective Java", "Joshua Bloch", 2018);
        
        book.open();
        System.out.println(book.getDetails());
        book.close();
    }
}
