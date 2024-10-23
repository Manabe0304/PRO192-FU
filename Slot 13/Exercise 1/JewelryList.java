/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Arrays;

public class JewelryList {
    private ArrayList<Jewelry> items;
    private int numOfItems;
    private final int MAX = 100;

    public JewelryList() {
        items = new ArrayList<>(MAX);
        numOfItems = 0;
    }

    public void addItem(Jewelry item) {
        if (numOfItems < MAX) {
            items.add(item);
            numOfItems++;
        } else {
            System.out.println("Media list is full.");
        }
    }

    public void displayAll() {
        if (numOfItems == 0) {
            System.out.println("No items to display.");
        } else {
            for (int i = 0; i < numOfItems; i++) {
                System.out.println(items.get(i).toString());
            }
        }
    }

    public Jewelry findItemByMaterial(String material) {
        for (int i = 0; i < numOfItems; i++) {
            if (items.get(i).getMaterial().equalsIgnoreCase(material)) {
                return items.get(i);
            }
        }
        return null;
    }

    public Jewelry findItemByDesign(String design) {
        for (int i = 0; i < numOfItems; i++) {
            if (items.get(i).getDesign().equalsIgnoreCase(design)) {
                return items.get(i);
            }
        }
        return null;
    }

    public void updateItem(int index, Jewelry newItem) {
        if (index >= 0 && index < numOfItems) {
            items.set(index, newItem);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void removeItem(int index) {
        if (index >= 0 && index < numOfItems) {
            items.remove(index);
            numOfItems--;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void displayItemsByType(String type) {
        for (int i = 0; i < numOfItems; i++) {
            if (items.get(i).getClass().equals(type)) {
                System.out.println(items.get(i).toString());
            }
        }
    }

    public void sortItemsByPrice() {
        // Sort the array using bubble sort based on the string representation
        for (int i = 0; i < numOfItems - 1; i++) {
            for (int j = 0; j < numOfItems - i - 1; j++) {
                if (items.get(j).toString().compareTo(items.get(j + 1).toString()) > 0) {
                    Jewelry temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        }
    }
}
