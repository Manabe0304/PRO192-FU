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
        Car car = new Car();
        
        try {
            // Test Case 1
            System.out.println("Sample 1: Car Test Case");

            // Get and set model
            System.out.println("Enter model: ");
            car.setModel(sc.nextLine());

            // Get and set year
            System.out.println("Enter year: ");
            car.setYear(sc.nextInt());

            // Output results
            System.out.println("Test getModel(): " + car.getModel());
            System.out.println("Test getYear(): " + car.getYear());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
