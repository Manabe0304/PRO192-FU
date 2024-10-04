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

    // Default constructor
    public Cala() {
        this.owner = "";
        this.price = 0;
    }

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
            throw new IllegalArgumentException("Owner cannot be null or empty");
        }
        this.owner = owner;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(int price) {
        if (price < 0 || price > 100000) {
            throw new IllegalArgumentException("Price must be between 0 and 100,000");
        }
        this.price = price;
    }

    // Final toString method to prevent overriding
    @Override
    public String toString() {
        return owner + " @ " + price;
    }

    // Equals method for owner and price comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cala cala = (Cala) obj;
        return price == cala.price && owner.equals(cala.owner);
    }

    // HashCode method consistent with equals
    @Override
    public int hashCode() {
        return 31 * owner.hashCode() + price;
    }
}
