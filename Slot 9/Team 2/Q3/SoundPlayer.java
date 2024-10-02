/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Asus
 */
public interface SoundPlayer {
    // Default method to play sound
    public default void play() {
        // To be implemented with a default message
        System.out.println("Playing sound...");
    }
}
