public class Book {
    // Attributes for title, author, and ISBN
    private String title;
    private String author;
    private String ISBN;

    // Constructor to initialize the attributes
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Book Title: " + title + " | Author: " + author + " | ISBN: " + ISBN);
    }

    // Getters (optional, if needed)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}
