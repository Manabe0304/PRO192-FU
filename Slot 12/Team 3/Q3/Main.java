/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Coffee> coffees = new ArrayList<>();
        
        // **Adding Coffees**
        Coffee coffee1 = new Coffee("Americano", 10);
        Coffee coffee2 = new Coffee("Cappuccino", 15);
        Coffee coffee3 = new Coffee("Latte", 25);
        Coffee coffee4 = new Coffee("Mocha", 8);
        coffees.add(coffee1);
        coffees.add(coffee2);
        coffees.add(coffee3);
        coffees.add(coffee4);
        
        MyCoffee myCoffeeManager = new MyCoffee(coffees);
        
        // **Counting Coffees whose names do not contain both 'A' and 'B' (f1)**
        int count = myCoffeeManager.f1(coffees);
        System.out.println("Count of Coffees whose names do not contain both 'A' and 'B': " + count);
        
        // **Removing the largest Coffee (f2)**
        myCoffeeManager.f2(coffees);
        System.out.println("Coffees after removing the largest:");
        for (Coffee coffee : coffees) {
            System.out.println(coffee.getName() + " - Size: " + coffee.getSize());
        }
        
        // **Sorting the first three Coffees by the unit digit of their size in descending order (f3)**
        myCoffeeManager.f3(coffees);
        System.out.println("First three Coffees after sorting by unit digit of size:");
        for (int i = 0; i < Math.min(3, coffees.size()); i++) {
            Coffee coffee = coffees.get(i);
            System.out.println(coffee.getName() + " - Size: " + coffee.getSize());
        }
    }
}
