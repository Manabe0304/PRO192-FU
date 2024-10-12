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
        ArrayList<SpecCoffee> coffees = new ArrayList<>();

        // Adding specialized coffees
        SpecCoffee coffee1 = new SpecCoffee("Cappuccino", 5, 10);
        SpecCoffee coffee2 = new SpecCoffee("Mocha", 6, 15);
        SpecCoffee.addSpecCoffee(coffees, coffee1);
        SpecCoffee.addSpecCoffee(coffees, coffee2);

        // Sorting coffees by price
        SpecCoffee.sortSpecCoffeesByPrice(coffees);
        System.out.println("SpecCoffees sorted by price:");
        for (SpecCoffee coffee : coffees) {
            System.out.println(coffee.getName() + " - $" + coffee.getPrice() + " (" + coffee.getSize() + "oz)");
        }

        // Updating a coffee's size and price
        SpecCoffee.updateSizeAndPrice(coffees, "Cappuccino", 7, 12);
        System.out.println("Updated Cappuccino size and price:");

        // Finding a coffee
        SpecCoffee foundCoffee = SpecCoffee.findSpecCoffeeByName(coffees, "Cappuccino");
        if (foundCoffee != null) {
            System.out.println(foundCoffee.getName() + " - $" + foundCoffee.getPrice() + " (" + foundCoffee.getSize() + "oz)");
        }

        // Removing a specialized coffee
        SpecCoffee.removeSpecCoffee(coffees, "Mocha");
        System.out.println("SpecCoffees after removing Mocha:");
        for (SpecCoffee coffee : coffees) {
            System.out.println(coffee.getName() + " - $" + coffee.getPrice() + " (" + coffee.getSize() + "oz)");
        }
    }
}
