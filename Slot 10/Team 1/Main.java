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
        // Create SpecCala object using constructor
        SpecCala specCala = new SpecCala("John Doe", 100, 5);
        Scanner input = new Scanner(System.in);

        // Input details from user
        System.out.print("Enter owner: ");
        String owner = input.nextLine();
        specCala.setOwner(owner);

        System.out.print("Enter price: ");
        int price = input.nextInt();
        specCala.setPrice(price);

        System.out.print("Enter color: ");
        int color = input.nextInt();
        specCala.setColor(color);

        // Test toString() method
        System.out.println("1. Test toString()");
        System.out.println("Output: " + specCala.toString());

        // Test setData() method
        System.out.println("2. Test setData()");
        specCala.setData();
        System.out.println("Output: " + specCala.toString());

        // Test getValue() method
        System.out.println("3. Test getValue()");
        System.out.println("Output: " + specCala.getValue());

        // Test clone() method
        SpecCala clonedCala = specCala.clone();
        System.out.println("4. Test clone()");
        System.out.println("Cloned Object Output: " + clonedCala.toString());
        
        // Test equals() method
        System.out.println("5. Test equals()");
        System.out.println("Are objects equal? " + specCala.equals(clonedCala));
    }
}
