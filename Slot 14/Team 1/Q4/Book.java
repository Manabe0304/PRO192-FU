/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Book {
    // Fields
    private int bookId;
    private String bookTitle;
    private String author;

    // Constructor
    public Book(int bookId, String bookTitle, String author) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.author = author;
    }

    // Getter for bookId
    public int getBookId() {
        return bookId;
    }

    // Getter for bookTitle
    public String getBookTitle() {
        return bookTitle;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Override toString method to return book details
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Title: " + bookTitle + ", Author: " + author;
    }
}
