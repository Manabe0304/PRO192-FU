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

public class Coffee {
    // Fields
    private String name;
    private int size;

    // Constructor
    public Coffee(String name, int size) {
        this.name = name;
        this.size = size;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for size
    public void setSize(int size) {
        this.size = size;
    }

    // Getter for size
    public int getSize() {
        return size;
    }

    // Method to add a coffee to the ArrayList
    public static void addCoffee(ArrayList<Coffee> coffeeArray, Coffee newCoffee) {
        coffeeArray.add(newCoffee);
    }

    // Method to update the size of a specific coffee by name
    public static void updateSize(ArrayList<Coffee> coffeeArray, String name, int newSize) {
        for (Coffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                coffee.setSize(newSize);
                System.out.println("Updated " + name + " size to " + newSize);
                return;
            }
        }
        System.out.println("Coffee with name " + name + " not found.");
    }

    // Method to remove a coffee by its name
    public static void removeCoffee(ArrayList<Coffee> coffeeArray, String name) {
        Coffee coffeeToRemove = null;
        for (Coffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                coffeeToRemove = coffee;
                break;
            }
        }
        if (coffeeToRemove != null) {
            coffeeArray.remove(coffeeToRemove);
            System.out.println("Removed coffee: " + name);
        } else {
            System.out.println("Coffee with name " + name + " not found.");
        }
    }

    // Method to sort coffees by size in ascending order
    public static void sortCoffeesBySize(ArrayList<Coffee> coffeeArray) {
        coffeeArray.sort(Comparator.comparingInt(Coffee::getSize));
    }

    // Method to find a coffee by its name
    public static Coffee findCoffeeByName(ArrayList<Coffee> coffeeArray, String name) {
        for (Coffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                return coffee;
            }
        }
        System.out.println("Coffee with name " + name + " not found.");
        return null;
    }
}
