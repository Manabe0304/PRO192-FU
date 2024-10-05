/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        
        try {
            // Test Case 1
            System.out.println("Sample 1: Book Test Case");
        
            System.out.println("Enter title: ");
            book.setTitle(sc.nextLine());
        
            System.out.println("Enter pages: ");
            book.setPages(sc.nextInt());
        
            System.out.println("Test getTitle(): " + book.getTitle());
            System.out.println("Test getPages(): " + book.getPages());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
