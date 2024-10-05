/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Smartphone extends Device {
    private int batteryLife;

    public Smartphone() {}

    public Smartphone(String brand, int price, int batteryLife) {
        super(brand, price);
        setBatteryLife(batteryLife);
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        if (batteryLife <= 0) {
            throw new IllegalArgumentException("Battery life must be a positive number");
        }
        this.batteryLife = batteryLife;
    }

    public void extendBatteryLife() {
        this.batteryLife += 20;
    }

    public int calculateValue() {
        return getPrice() + batteryLife;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + batteryLife;
    }
}
