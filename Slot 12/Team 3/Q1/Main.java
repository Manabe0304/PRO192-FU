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
        ArrayList<Coffee> coffees = new ArrayList<>();
        
        // **Adding coffees**
        Coffee coffee1 = new Coffee("Espresso", 2);
        Coffee coffee2 = new Coffee("Latte", 12);
        Coffee.addCoffee(coffees, coffee1);
        Coffee.addCoffee(coffees, coffee2);
        
        // **Sorting coffees by size**
        Coffee.sortCoffeesBySize(coffees);
        System.out.println("Sorted Coffees by Size:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getName() + " - Size: " + coffee.getSize());
        }
        
        // **Updating a coffee's size**
        Coffee.updateSize(coffees, "Espresso", 3);
        System.out.println("Updated Espresso size:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getName() + " - Size: " + coffee.getSize());
        }
        
        // **Removing a coffee**
        Coffee.removeCoffee(coffees, "Latte");
        System.out.println("After removing Latte:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getName() + " - Size: " + coffee.getSize());
        }
        
        // **Finding a coffee**
        Coffee foundCoffee = Coffee.findCoffeeByName(coffees, "Espresso");
        if (foundCoffee != null) {
            System.out.println("Found Coffee: " + foundCoffee.getName() + " - Size: " + foundCoffee.getSize());
        } else {
            System.out.println("Coffee not found!");
        }
    }
}
