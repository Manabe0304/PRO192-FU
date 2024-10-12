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

public class Coffee {
    // **Fields**
    private String name;
    private int size;
    
    // **Constructor**
    public Coffee(String name, int size) {
        // Complete this constructor
        this.name = name;
        this.size = size;
    }
    
    // **Getter and Setter methods**
    public String getName() {
        // Complete this method
        return name;
    }
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        // Complete this method
        this.size = size;
    }

    // **Main methods for add, update, remove, sort, and find**
    public static void addCoffee(ArrayList<Coffee> coffeeArray, Coffee newCoffee) {
        coffeeArray.add(newCoffee);
    }
    
    public static void updateSize(ArrayList<Coffee> coffeeArray, String name, int newSize) {
        for (Coffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                coffee.setSize(newSize);
                break;
            }
        }
    }

    public static void removeCoffee(ArrayList<Coffee> coffeeArray, String name) {
        coffeeArray.removeIf(coffee -> coffee.getName().equalsIgnoreCase(name));
    }
    
    public static void sortCoffeesBySize(ArrayList<Coffee> coffeeArray) {
        Collections.sort(coffeeArray, Comparator.comparingInt(Coffee::getSize));
    }
    
    public static Coffee findCoffeeByName(ArrayList<Coffee> coffeeArray, String name) {
        for (Coffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                return coffee;
            }
        }
        return null; // Return null if no coffee found with that name
    }
}
