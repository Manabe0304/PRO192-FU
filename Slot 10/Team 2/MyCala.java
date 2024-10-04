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
import java.util.List;

public class MyCala implements ICala {
    private List<Cala> calaList;

    // Constructor to initialize MyCala with a list of Cala objects
    public MyCala(List<Cala> calaList) {
        this.calaList = new ArrayList<>(calaList); // Deep copy to avoid external modification
    }

    // f1: Count the number of Cala objects with even prices
    @Override
    public int f1() {
        int count = 0;
        for (Cala cala : calaList) {
            if (cala.getPrice() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // f2: Remove the second Cala object with the minimum price
    @Override
    public void f2() {
        if (calaList.size() < 2) {
            return; // If the list has fewer than 2 elements, do nothing
        }

        // Find the minimum price in the list
        int minPrice = Integer.MAX_VALUE;
        for (Cala cala : calaList) {
            if (cala.getPrice() < minPrice) {
                minPrice = cala.getPrice();
            }
        }

        // Count and remove the second Cala object with the minimum price
        int count = 0;
        for (int i = 0; i < calaList.size(); i++) {
            if (calaList.get(i).getPrice() == minPrice) {
                count++;
                if (count == 2) {
                    calaList.remove(i);
                    break;
                }
            }
        }
    }

    // f3: Sort the Cala list by the first character of the owner in descending order
    @Override
    public void f3() {
        Collections.sort(calaList, new Comparator<Cala>() {
            @Override
            public int compare(Cala c1, Cala c2) {
                // Compare by the first character of the owner, case-insensitive
                return Character.toLowerCase(c2.getOwner().charAt(0)) - Character.toLowerCase(c1.getOwner().charAt(0));
            }
        });
    }
}
