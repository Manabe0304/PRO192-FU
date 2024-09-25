/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Ebook extends Book{
    // Attribute for file size
    private double fileSize;

    // Constructor to initialize all attributes, including those of the superclass
    public Ebook(String title, String author, String ISBN, double fileSize) {
        super(title, author, ISBN); // Call the Book class constructor
        this.fileSize = fileSize;
    }

    // Override the method to display ebook information
    @Override
    public void displayBookInfo() {
        System.out.println("Ebook Title: " + getTitle() + " | Author: " + getAuthor() + " | ISBN: " + getISBN() + " | File Size: " + fileSize + " MB");
    }

    // Getter for fileSize (optional)
    public double getFileSize() {
        return fileSize;
    }
}
