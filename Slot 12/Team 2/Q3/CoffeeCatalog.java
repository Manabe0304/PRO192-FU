/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Comparator;

public class CoffeeCatalog {
    // Fields
    private ArrayList<SpecCoffee> coffees;

    // Constructor
    public CoffeeCatalog() {
        coffees = new ArrayList<>();
    }

    // Method to add a SpecCoffee to the catalog
    public void addSpecCoffee(SpecCoffee newCoffee) {
        coffees.add(newCoffee);
        System.out.println("Added SpecCoffee: " + newCoffee.getName());
    }

    // Method to update the price of a specific SpecCoffee by its index
    public void updatePriceByIndex(int index, int newPrice) {
        if (index >= 0 && index < coffees.size()) {
            coffees.get(index).setPrice(newPrice);
            System.out.println("Updated price of " + coffees.get(index).getName() + " to " + newPrice);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    // Method to remove a SpecCoffee by its index
    public void removeSpecCoffeeByIndex(int index) {
        if (index >= 0 && index < coffees.size()) {
            SpecCoffee removedCoffee = coffees.remove(index);
            System.out.println("Removed SpecCoffee: " + removedCoffee.getName());
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }

    // Method to sort SpecCoffees alphabetically by name
    public void sortSpecCoffeesByName() {
        coffees.sort(Comparator.comparing(SpecCoffee::getName, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Sorted SpecCoffees by name.");
    }

    // Method to find a SpecCoffee by a partial match of its name (case insensitive)
    public SpecCoffee findSpecCoffeeByNamePartial(String partialName) {
        for (SpecCoffee coffee : coffees) {
            if (coffee.getName().toLowerCase().contains(partialName.toLowerCase())) {
                return coffee;
            }
        }
        System.out.println("No SpecCoffee found with partial name: " + partialName);
        return null;
    }
    
    public ArrayList<SpecCoffee> getCoffees() {
        return coffees;
    }
}
