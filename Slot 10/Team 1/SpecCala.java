/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class SpecCala extends Cala {
    private int color;

    // Default constructor
    public SpecCala() {
        super();
        this.color = 0;
    }

    // Custom constructor
    public SpecCala(String owner, int price, int color) {
        super(owner, price); // Call to parent constructor
        setColor(color);
    }

    // Getter for color
    public int getColor() {
        return color;
    }

    // Setter for color with validation
    public void setColor(int color) {
        if (color < 0) {
            throw new IllegalArgumentException("Color must be a positive integer");
        }
        this.color = color;
    }

    // Override toString method to include color
    @Override
    public String toString() {
        return super.toString() + " # " + color;
    }

    // Method to capitalize the owner's name properly
    public void setData() {
        String[] nameParts = getOwner().toLowerCase().split("\\s+");
        StringBuilder formattedName = new StringBuilder();
        for (String part : nameParts) {
            if (part.length() > 0) {
                formattedName.append(Character.toUpperCase(part.charAt(0)))
                             .append(part.substring(1)).append(" ");
            }
        }
        setOwner(formattedName.toString().trim());
    }

    // Method to get value based on color
    public int getValue() {
        return (color % 2 == 0) ? getPrice() + 1 : getPrice() * 2;
    }

    // Clone method to create a deep copy of SpecCala object
    @Override
    public SpecCala clone() {
        return new SpecCala(getOwner(), getPrice(), color);
    }
}
