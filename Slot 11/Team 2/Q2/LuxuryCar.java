/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class LuxuryCar extends Car {
    private int luxuryLevel;

    public int getLuxuryLevel() {
        return luxuryLevel;
    }

    public void setLuxuryLevel(int luxuryLevel) {
        if (luxuryLevel < 0) {
            throw new IllegalArgumentException("Luxury level must be a non-negative number");
        }
        this.luxuryLevel = luxuryLevel;
    }

    public void enhanceLuxury() {
        this.luxuryLevel += 5;
    }

    public int calculateInsurance() {
        return getYear() + luxuryLevel * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + luxuryLevel;
    }
}
