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
        Smartphone phone = new Smartphone();
        
        try {
            // Test Case 1
            System.out.println("Sample 1: Smartphone Test Case");

            // Get and set brand
            System.out.println("Enter brand: ");
            phone.setBrand(sc.nextLine());

            // Get and set price
            System.out.println("Enter price: ");
            phone.setPrice(sc.nextInt());

            // Get and set battery life
            System.out.println("Enter battery life: ");
            phone.setBatteryLife(sc.nextInt());

            // Output results
            System.out.println("Test toString(): " + phone.toString());

            // Test extendBatteryLife method
            phone.extendBatteryLife();
            System.out.println("Test extended battery life: " + phone.toString());

            // Test calculateValue method
            System.out.println("Test calculateValue(): " + phone.calculateValue());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
