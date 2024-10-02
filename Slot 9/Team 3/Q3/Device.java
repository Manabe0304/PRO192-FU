/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Asus
 */
public interface Device {
    // Default method to provide device information
    public default void deviceInfo() {
        // To be implemented with a default message
        System.out.println("This is a generic device.");
    }
}
