/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class SpecBrick extends Brick {
    private int color;

    // Getter for color
    public int getColor() {
        return color;
    }

    // Setter for color with validation
    public void setColor(int color) {
        if (color <= 0) {
            throw new IllegalArgumentException("Color must be a positive number");
        }
        this.color = color;
    }

    // Override toString to include color
    @Override
    public String toString() {
        return getPlace() + ", " + getPrice() + ", " + color;
    }

    // Method to insert "BCA" into place at position 2
    public void setData() {
        String place = getPlace();
        if (place.length() >= 2) {
            setPlace(place.substring(0, 2) + "BCA" + place.substring(2));
        } else {
            setPlace(place + "BCA");
        }
    }

    // Method to get value based on color
    public int getValue() {
        if (color == 7) {
            return getPrice() + 9;
        } else {
            return getPrice() + 6;
        }
    }
}
