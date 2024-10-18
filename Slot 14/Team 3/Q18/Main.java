/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a TreeMap to store product inventory
        TreeMap<Integer, Product> inventory = new TreeMap<>();

        // Add sample products to the map
        inventory.put(101, new Product(101, "Laptop", 15));
        inventory.put(102, new Product(102, "Smartphone", 30));
        inventory.put(103, new Product(103, "Tablet", 25));
        inventory.put(104, new Product(104, "Monitor", 10));
        inventory.put(105, new Product(105, "Keyboard", 50));

        // Print all products in the inventory
        System.out.println("Inventory:");
        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }

        // Retrieve and print the stock level of a specific product
        System.out.println("\nStock level of Product ID 103: " + inventory.get(103).getStockLevel());

        // Update the stock level of a product and print the updated map
        inventory.get(104).stockLevel = 12; // Assuming a public field or setter for stockLevel
        System.out.println("\nUpdated Inventory:");
        for (Map.Entry<Integer, Product> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Details: " + entry.getValue());
        }
    }
}
