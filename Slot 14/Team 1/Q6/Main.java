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
        // Create a TreeMap to store customer reward points
        TreeMap<Integer, Integer> customerRewards = new TreeMap<>();

        // Add sample customers and their reward points to the map
        customerRewards.put(1001, 120);
        customerRewards.put(1002, 250);
        customerRewards.put(1003, 300);
        customerRewards.put(1004, 150);
        customerRewards.put(1005, 500);

        // Print all customers and their reward points
        System.out.println("Customer Reward Points:");
        for (Map.Entry<Integer, Integer> entry : customerRewards.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey() + ", Reward Points: " + entry.getValue());
        }

        // Retrieve and print the reward points of a specific customer
        System.out.println("\nReward Points for Customer ID 1003: " + customerRewards.get(1003));

        // Update the reward points for a customer and print the updated map
        customerRewards.replace(1003, 350);
        System.out.println("\nUpdated Customer Reward Points:");
        for (Map.Entry<Integer, Integer> entry : customerRewards.entrySet()) {
            System.out.println("Customer ID: " + entry.getKey() + ", Reward Points: " + entry.getValue());
        }
    }
}
