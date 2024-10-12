/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Cake {
    // Fields
    private String maker;
    private int price;

    // Constructor
    public Cake(String maker, int price) {
        this.maker = maker;
        this.price = price;
    }

    // Getter and Setter methods
    public String getMaker() {
        return maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method to add a new Cake to the list
    public static void addCake(ArrayList<Cake> cakeArray, Cake newCake) {
        cakeArray.add(newCake);
    }

    // Method to update the price of a Cake by its maker
    public static void updatePrice(ArrayList<Cake> cakeArray, String maker, int newPrice) {
        for (Cake cake : cakeArray) {
            if (cake.getMaker().equals(maker)) {
                cake.setPrice(newPrice);
                System.out.println("Price updated for " + maker);
                return;
            }
        }
        System.out.println("Cake by maker " + maker + " not found.");
    }

    // Method to remove a Cake by its maker
    public static void removeCake(ArrayList<Cake> cakeArray, String maker) {
        Cake cakeToRemove = null;
        for (Cake cake : cakeArray) {
            if (cake.getMaker().equals(maker)) {
                cakeToRemove = cake;
                break;
            }
        }
        if (cakeToRemove != null) {
            cakeArray.remove(cakeToRemove);
            System.out.println(maker + " cake removed.");
        } else {
            System.out.println("Cake by maker " + maker + " not found.");
        }
    }

    // Method to sort Cakes by price in ascending order
    public static void sortCakesByPrice(ArrayList<Cake> cakeArray) {
        Collections.sort(cakeArray, Comparator.comparingInt(Cake::getPrice));
    }

    // Method to find a Cake by its maker
    public static Cake findCakeByMaker(ArrayList<Cake> cakeArray, String maker) {
        for (Cake cake : cakeArray) {
            if (cake.getMaker().equals(maker)) {
                return cake;
            }
        }
        System.out.println("Cake by maker " + maker + " not found.");
        return null;
    }
}
