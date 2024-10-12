/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CakeCatalog catalog = new CakeCatalog();

        // Adding cakes
        Cake cake1 = new Cake("FranceCake", 12);
        Cake cake2 = new Cake("VietnamCake", 15);
        catalog.addCake(cake1);
        catalog.addCake(cake2);

        // Sorting cakes alphabetically by maker
        catalog.sortCakesByMaker();
        System.out.println("Cakes sorted by maker:");
        for (Cake cake : catalog.getCakes()) { // Use the getter method
            System.out.println(cake.getMaker() + " - " + cake.getPrice() + " USD");
        }

        // Updating a cake's price by index
        catalog.updatePriceByIndex(0, 20);
        System.out.println("Updated price for " + cake1.getMaker() + ": " + cake1.getPrice() + " USD");

        // Finding a cake
        Cake foundCake = catalog.findCakeByMakerPartial("France");
        if (foundCake != null) {
            System.out.println("Found Cake Maker: " + foundCake.getMaker() + " - " + foundCake.getPrice() + " USD");
        }

        // Removing a cake by index
        catalog.removeCakeByIndex(1);
        System.out.println("Cakes after removing VietnamCake:");
        for (Cake cake : catalog.getCakes()) { // Use the getter method
            System.out.println(cake.getMaker() + " - " + cake.getPrice() + " USD");
        }
    }
}
