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
        // Create an ArrayList to store orders
        ArrayList<Order> orderList = new ArrayList<>();

        // Add sample orders to the list
        orderList.add(new Order(1, "Laptop", 2));
        orderList.add(new Order(2, "Smartphone", 5));
        orderList.add(new Order(3, "Tablet", 3));
        orderList.add(new Order(4, "Monitor", 1));
        orderList.add(new Order(5, "Keyboard", 10));

        // Print all orders
        System.out.println("Order List:");
        for (Order order : orderList) {
            System.out.println(order);
        }

        // Retrieve and print the order at index 1
        System.out.println("\nOrder at Index 1:");
        System.out.println(orderList.get(1));

        // Update the quantity of an order and print the updated list
        orderList.get(2).setQuantity(6); // Assuming a setter method is implemented
        System.out.println("\nUpdated Order List:");
        for (Order order : orderList) {
            System.out.println(order);
        }
    }
}
