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
    private int price;
    
    // **Constructor**
    public Coffee(String name, int size, int price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
    
    // **Getter methods**
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    // **Setter method**
    public void setPrice(int price) {
        this.price = price;
    }

    // **Main methods for add, update, remove, sort, and find**
    public static void addCoffee(ArrayList<Coffee> coffeeArray, Coffee newCoffee) {
        coffeeArray.add(newCoffee);
    }
    
    public static void updatePrice(ArrayList<Coffee> coffeeArray, String name, int newPrice) {
        for (Coffee coffee : coffeeArray) {
            if (coffee.getName().equalsIgnoreCase(name)) {
                coffee.setPrice(newPrice);
                break;
            }
        }
    }

    public static void removeCoffee(ArrayList<Coffee> coffeeArray, String name) {
        coffeeArray.removeIf(coffee -> coffee.getName().equalsIgnoreCase(name));
    }
    
    public static void sortCoffeesByPrice(ArrayList<Coffee> coffeeArray) {
        Collections.sort(coffeeArray, Comparator.comparingInt(Coffee::getPrice));
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
