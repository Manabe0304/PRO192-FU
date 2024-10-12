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
        ArrayList<Cake> cakes = new ArrayList<>();

        // Adding cakes
        Cake cake1 = new Cake("FranceCake", 12);
        Cake cake2 = new Cake("VietnamCake", 15);
        Cake.addCake(cakes, cake1);
        Cake.addCake(cakes, cake2);

        // Sorting cakes by price in descending order
        Cake.sortCakesByPriceDesc(cakes);
        System.out.println("Cakes sorted by price in descending order:");
        for (Cake cake : cakes) {
            System.out.println(cake.getMaker() + " - " + cake.getPrice() + " USD");
        }

        // Updating a cake's maker and price
        Cake.updateMakerAndPrice(cakes, "FranceCake", "GermanCake", 25);
        System.out.println("Updated maker and price of FranceCake to GermanCake:");

        // Finding a cake by maker
        Cake foundCake = Cake.findCakeByMaker(cakes, "GermanCake");
        if (foundCake != null) {
            System.out.println(foundCake.getMaker() + " - " + foundCake.getPrice() + " USD");
        }

        // Removing a cake
        Cake.removeCake(cakes, "VietnamCake");
        System.out.println("Cakes after removing VietnamCake:");
        for (Cake cake : cakes) {
            System.out.println(cake.getMaker() + " - " + cake.getPrice() + " USD");
        }
    }
}
