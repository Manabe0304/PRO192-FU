/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Create a Book object
        Book physicalBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789");
        
        // Create an Ebook object
        Ebook ebook = new Ebook("Digital Fortress", "Dan Brown", "987654321", 2.5);
        
        // Display information of the physical book
        physicalBook.displayBookInfo();
        
        // Display information of the ebook
        ebook.displayBookInfo();
    }
}
