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

public class SpecCoffee extends Coffee {
    // Fields
    private int price;

    // Constructor
    public SpecCoffee(String name, int size, int price) {
        super(name, size);
        this.price = price;
    }

    // Getter for price
    public int getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(int price) {
        this.price = price;
    }

    // Method to add a SpecCoffee to the ArrayList
    public static void addSpecCoffee(ArrayList<SpecCoffee> coffeeArray, SpecCoffee newCoffee) {
        coffeeArray.add(newCoffee);
    }

    // Method to update the size and price of a specific SpecCoffee by name
    public static void updateSizeAndPrice(ArrayList<SpecCoffee> coffeeArray, String name, int newSize, int newPrice) {
        for (SpecCoffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                coffee.setSize(newSize);
                coffee.setPrice(newPrice);
                System.out.println("Updated " + name + " size to " + newSize + " and price to " + newPrice);
                return;
            }
        }
        System.out.println("SpecCoffee with name " + name + " not found.");
    }

    // Method to remove a SpecCoffee by its name
    public static void removeSpecCoffee(ArrayList<SpecCoffee> coffeeArray, String name) {
        SpecCoffee coffeeToRemove = null;
        for (SpecCoffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                coffeeToRemove = coffee;
                break;
            }
        }
        if (coffeeToRemove != null) {
            coffeeArray.remove(coffeeToRemove);
            System.out.println("Removed SpecCoffee: " + name);
        } else {
            System.out.println("SpecCoffee with name " + name + " not found.");
        }
    }

    // Method to sort SpecCoffees by price in ascending order
    public static void sortSpecCoffeesByPrice(ArrayList<SpecCoffee> coffeeArray) {
        coffeeArray.sort(Comparator.comparingInt(SpecCoffee::getPrice));
    }

    // Method to find a SpecCoffee by its name
    public static SpecCoffee findSpecCoffeeByName(ArrayList<SpecCoffee> coffeeArray, String name) {
        for (SpecCoffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                return coffee;
            }
        }
        System.out.println("SpecCoffee with name " + name + " not found.");
        return null;
    }
}
