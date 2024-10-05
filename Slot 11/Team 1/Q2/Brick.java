/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Brick {
    private String place;
    private int price;

    // Getter for place
    public String getPlace() {
        return place;
    }

    // Setter for place with validation
    public void setPlace(String place) {
        if (place == null || place.trim().isEmpty()) {
            throw new IllegalArgumentException("Place cannot be null or empty");
        }
        this.place = place;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be a positive number");
        }
        this.price = price;
    }

    // toString method
    @Override
    public String toString() {
        return place + ", " + price;
    }
}
