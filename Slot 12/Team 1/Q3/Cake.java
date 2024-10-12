/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Cake {
    // Fields
    private String maker;
    private int price;

    // Constructor
    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    // Getter methods
    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    // Setter methods
    public void setPrice(int price) {
        this.price = price;
    }
}
