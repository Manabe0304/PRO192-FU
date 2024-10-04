/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Cala {
    private String owner;
    private int price;

    // Custom constructor
    public Cala(String owner, int price) {
        setOwner(owner);
        setPrice(price);
    }

    // Getter for owner
    public String getOwner() {
        return owner;
    }

    // Setter for owner with validation
    public void setOwner(String owner) {
        if (owner == null || owner.trim().isEmpty()) {
            throw new IllegalArgumentException("Owner name must contain only alphabetic characters and cannot be empty");
        }
        this.owner = owner;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(int price) {
        if (price < 1 || price > 100000) {
            throw new IllegalArgumentException("Price must be between 1 and 100,000");
        }
        this.price = price;
    }

    // Equals method for comparing two Cala objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cala cala = (Cala) obj;
        return price == cala.price && owner.equals(cala.owner);
    }

    // HashCode method to ensure consistency with equals
    @Override
    public int hashCode() {
        return 31 * owner.hashCode() + price;
    }

    // ToString method for string representation
    @Override
    public String toString() {
        return "(" + owner + ")"; // Use parentheses for output formatting
    }
}
