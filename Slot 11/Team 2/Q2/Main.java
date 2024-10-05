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
        LuxuryCar car = new LuxuryCar();
        
        try {
            // Test Case 1
            System.out.println("Sample 1: LuxuryCar Test Case");

            // Get and set model
            System.out.println("Enter model: ");
            car.setModel(sc.nextLine());

            // Get and set year
            System.out.println("Enter year: ");
            car.setYear(sc.nextInt());

            // Get and set luxury level
            System.out.println("Enter luxury level: ");
            car.setLuxuryLevel(sc.nextInt());

            // Output results
            System.out.println("Test toString(): " + car.toString());

            // Test enhanceLuxury method
            car.enhanceLuxury();
            System.out.println("Test enhanced luxury level: " + car.toString());

            // Test calculateInsurance method
            System.out.println("Test calculateInsurance(): " + car.calculateInsurance());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
