/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Bottle {
    private String maker;
    private int volume;

    // Getter for maker
    public String getMaker() {
        return maker;
    }

    // Setter for maker with validation
    public void setMaker(String maker) {
        if (maker == null || maker.trim().isEmpty()) {
            throw new IllegalArgumentException("Maker cannot be null or empty");
        }
        this.maker = maker;
    }

    // Getter for volume
    public int getVolume() {
        return volume;
    }

    // Setter for volume with validation
    public void setVolume(int volume) {
        if (volume <= 0) {
            throw new IllegalArgumentException("Volume must be a positive number");
        }
        this.volume = volume;
    }
}
