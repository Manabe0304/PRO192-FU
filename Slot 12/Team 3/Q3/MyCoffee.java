/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCoffee implements ICoffee {
    // **Fields**
    private List<Coffee> coffeeList;

    // **Constructor**
    public MyCoffee(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }
    
    // **Method implementations**

    // Count Coffees whose names do not contain both 'A' and 'B'
    @Override
    public int f1(List<Coffee> coffeeList) {
        int count = 0;
        for (Coffee coffee : coffeeList) {
            String name = coffee.getName().toUpperCase();
            if (!(name.contains("A") && name.contains("B"))) {
                count++;
            }
        }
        return count;
    }

    // Remove the Coffee with the largest size
    @Override
    public void f2(List<Coffee> coffeeList) {
        if (!coffeeList.isEmpty()) {
            Coffee largestCoffee = Collections.max(coffeeList, Comparator.comparingInt(Coffee::getSize));
            coffeeList.remove(largestCoffee);
        }
    }

    // Sort the first three Coffees by the unit digit of their size in descending order
    @Override
    public void f3(List<Coffee> coffeeList) {
        int limit = Math.min(3, coffeeList.size());
        List<Coffee> firstThree = coffeeList.subList(0, limit);
        firstThree.sort((c1, c2) -> {
            int unitDigit1 = c1.getSize() % 10;
            int unitDigit2 = c2.getSize() % 10;
            return Integer.compare(unitDigit2, unitDigit1); // Sort in descending order
        });
    }
}
