/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Book {
    private String title;
    private int pages;
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle (String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }
    
    public int getPages() {
        return pages;
    }
    
    public void setPages(int pages) {
        if (pages <= 0) {
            throw new IllegalArgumentException("Pages must be a positive number");
        }
        this.pages = pages;
    }
}
