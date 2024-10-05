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

        // Test Case 1
        System.out.println("Sample 1: SpecBrick Test Case");
        SpecBrick brick = new SpecBrick();

        try {
            System.out.println("Enter place: ");
            brick.setPlace(sc.nextLine());

            System.out.println("Enter price: ");
            brick.setPrice(sc.nextInt());

            System.out.println("Enter color: ");
            brick.setColor(sc.nextInt());

            // Testing methods
            System.out.println("Test toString(): " + brick.toString());
            System.out.println("Test getValue(): " + brick.getValue());

            // Testing setData method
            brick.setData();
            System.out.println("Test after setData(): " + brick.toString());

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
