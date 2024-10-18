/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap to store product quantities
        HashMap<Integer, Integer> shoppingCart = new HashMap<>();

        // Create sample Product objects (not stored in the map, used for display purposes)
        Product product1 = new Product(101, "Laptop", 1200.50);
        Product product2 = new Product(102, "Phone", 799.99);
        Product product3 = new Product(103, "Headphones", 199.99);
        Product product4 = new Product(104, "Keyboard", 99.99);
        Product product5 = new Product(105, "Monitor", 299.99);

        // Add sample products with their quantities to the cart
        shoppingCart.put(product1.getProductId(), 2); // Product ID 101, Quantity 2
        shoppingCart.put(product2.getProductId(), 5); // Product ID 102, Quantity 5
        shoppingCart.put(product3.getProductId(), 1); // Product ID 103, Quantity 1
        shoppingCart.put(product4.getProductId(), 3); // Product ID 104, Quantity 3
        shoppingCart.put(product5.getProductId(), 4); // Product ID 105, Quantity 4

        // Print all products in the cart with their quantities
        System.out.println("Shopping Cart:");
        for (Map.Entry<Integer, Integer> entry : shoppingCart.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        // Retrieve and print the quantity of a specific product by its ID
        System.out.println("\nQuantity of Product ID 102: " + shoppingCart.get(102));

        // Update the quantity of a product and print the updated cart
        shoppingCart.replace(103, 2); // Update quantity of Product ID 103 to 2
        System.out.println("\nUpdated Shopping Cart:");
        for (Map.Entry<Integer, Integer> entry : shoppingCart.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
