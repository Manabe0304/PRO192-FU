/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class SpecCar extends Car {
    private int type;

    public SpecCar() {
        
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }

    public void setData() {
        setMaker("XZ" + getMaker());
        price += 20;
    }

    public int getValue() {
        int inc = (type < 7) ? 10 : 15;
        return getPrice() + inc;
    }
}
