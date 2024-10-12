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

        // Sorting cakes by price
        Cake.sortCakesByPrice(cakes);
        System.out.println("Cakes sorted by price:");
        for (Cake cake : cakes) {
            System.out.println(cake.getMaker() + " - " + cake.getPrice() + " USD");
        }

        // Updating a cake's price
        Cake.updatePrice(cakes, "FranceCake", 20);
        System.out.println("Updated FranceCake price:");

        // Finding a cake
        Cake foundCake = Cake.findCakeByMaker(cakes, "FranceCake");
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
