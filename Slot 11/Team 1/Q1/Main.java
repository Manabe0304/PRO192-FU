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
        System.out.println("Sample 1: Bottle Test Case");
        Bottle bottle = new Bottle();

        try {
            System.out.println("Enter maker: ");
            bottle.setMaker(sc.nextLine());

            System.out.println("Enter volume: ");
            bottle.setVolume(sc.nextInt());

            System.out.println("Test getMaker(): " + bottle.getMaker());
            System.out.println("Test getVolume(): " + bottle.getVolume());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
