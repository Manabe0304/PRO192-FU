/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Asus
 */
public interface Printer {
    // Default method to print
    public default void print() {
        // To be implemented with a default message
        System.out.println("Printing...");
    }
}
