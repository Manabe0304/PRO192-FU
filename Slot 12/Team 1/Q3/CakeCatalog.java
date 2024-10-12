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

public class CakeCatalog {
    // Field to hold the list of cakes
    private ArrayList<Cake> cakes;

    // Constructor
    public CakeCatalog() {
        cakes = new ArrayList<>();
    }

    // Method to add a new Cake to the catalog
    public void addCake(Cake newCake) {
        cakes.add(newCake);
    }

    // Method to update the price of a Cake by its index
    public void updatePriceByIndex(int index, int newPrice) {
        if (index >= 0 && index < cakes.size()) {
            cakes.get(index).setPrice(newPrice);
            System.out.println("Price updated for Cake at index " + index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to remove a Cake by its index
    public void removeCakeByIndex(int index) {
        if (index >= 0 && index < cakes.size()) {
            cakes.remove(index);
            System.out.println("Cake removed at index " + index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    // Method to sort Cakes alphabetically by maker
    public void sortCakesByMaker() {
        Collections.sort(cakes, Comparator.comparing(Cake::getMaker));
    }

    // Method to find a Cake by partial match of its maker (case insensitive)
    public Cake findCakeByMakerPartial(String partialMaker) {
        for (Cake cake : cakes) {
            if (cake.getMaker().toLowerCase().contains(partialMaker.toLowerCase())) {
                return cake;
            }
        }
        System.out.println("No cake found with maker containing: " + partialMaker);
        return null;
    }
    
    public ArrayList<Cake> getCakes() {
        return cakes;
    }
}
