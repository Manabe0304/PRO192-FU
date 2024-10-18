/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList to store books
        LinkedList<Book> bookList = new LinkedList<>();

        // Add sample books to the list
        bookList.add(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        bookList.add(new Book(2, "1984", "George Orwell"));
        bookList.add(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
        bookList.add(new Book(4, "Pride and Prejudice", "Jane Austen"));
        bookList.add(new Book(5, "Moby-Dick", "Herman Melville"));

        // Print all books
        System.out.println("Book Catalog:");
        for (Book book : bookList) {
            System.out.println(book);
        }

        // Retrieve and print the book at index 3
        System.out.println("\nBook at Index 3:");
        System.out.println(bookList.get(3));

        // Remove a book at index 2 and print the updated list
        bookList.remove(2);
        System.out.println("\nUpdated Book List:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
