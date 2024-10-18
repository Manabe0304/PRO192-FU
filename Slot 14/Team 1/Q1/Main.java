/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store products
        ArrayList<Product> productList = new ArrayList<>();

        // Add sample products to the list
        productList.add(new Product(1, "Laptop", 1500.00));
        productList.add(new Product(2, "Smartphone", 700.00));
        productList.add(new Product(3, "Tablet", 300.00));
        productList.add(new Product(4, "Smartwatch", 200.00));
        productList.add(new Product(5, "Headphones", 100.00));

        // Print all products
        System.out.println("All Products:");
        for (Product product : productList) {
            System.out.println(product);
        }

        // Retrieve and print product at index 2
        System.out.println("\nProduct at Index 2:");
        System.out.println(productList.get(2));

        // Remove product at index 1 and print updated list
        productList.remove(1);
        System.out.println("\nUpdated Product List:");
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
