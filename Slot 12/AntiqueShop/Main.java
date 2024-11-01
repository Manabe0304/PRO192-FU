/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AntiqueShop;

/**
 *
 * @author vuvan
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemList obj = new ItemList();
        int choice = 0;

        do {
            System.out.println("1. Add a new vase");
            System.out.println("2. Add a new statue");
            System.out.println("3. Add a new painting");
            System.out.println("4. Display all items");
            System.out.println("5. Find the items by the creator");
            System.out.println("6. Update the item by its index");
            System.out.println("7. Remove the item by its index");
            System.out.println("8. Display the list of vase items");
            System.out.println("9. Sort items in ascending order based on their values");
            System.out.println("10. Exit");
            System.out.print("Input your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    Item vase = new Vase();
                    vase.input();
                    if (obj.addItem(vase)) {
                        System.out.println("Vase added successfully.");
                    } else {
                        System.out.println("Failed to add vase.");
                    }
                    break;

                case 2:
                    Item statue = new Statue();
                    statue.input();
                    if (obj.addItem(statue)) {
                        System.out.println("Statue added successfully.");
                    } else {
                        System.out.println("Failed to add statue.");
                    }
                    break;

                case 3:
                    Item painting = new Painting();
                    painting.input();
                    if (obj.addItem(painting)) {
                        System.out.println("Painting added successfully.");
                    } else {
                        System.out.println("Failed to add painting.");
                    }
                    break;

                case 4:
                    obj.displayAll();
                    break;

                case 5:
                    System.out.print("Enter the creator to search: ");
                    String creator = sc.nextLine();
                    Item foundItem = obj.findItem(creator);
                    if (foundItem != null) {
                        System.out.println("Found item: " + foundItem);
                    } else {
                        System.out.println("No item found by that creator.");
                    }
                    break;

                case 6:
                    System.out.print("Enter the index of the item to update: ");
                    int updateIndex = sc.nextInt();
                    if (obj.updateItem(updateIndex)) {
                        System.out.println("Item updated successfully.");
                    } else {
                        System.out.println("Failed to update item.");
                    }
                    break;

                case 7:
                    System.out.print("Enter the index of the item to remove: ");
                    int removeIndex = sc.nextInt();
                    if (obj.removeItem(removeIndex)) {
                        System.out.println("Item removed successfully.");
                    } else {
                        System.out.println("Failed to remove item.");
                    }
                    break;

                case 8:
                    System.out.println("Displaying all vase items:");
                    obj.displayItemsByType("Vase");
                    break;

                case 9:
                    obj.sortItems();
                    System.out.println("Items sorted successfully.");
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 10);
    }
}