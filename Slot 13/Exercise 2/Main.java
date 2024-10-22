/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ItemList itemList = new ItemList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all items");
            System.out.println("2. Add item");
            System.out.println("3. Find item by name");
            System.out.println("4. Find item by type");
            System.out.println("5. Update item");
            System.out.println("6. Remove item");
            System.out.println("7. Sort items by price");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    itemList.displayAll();
                    break;
                case 2:
                    System.out.println("Enter item type (1. Plant, 2. Tool, 3. Fertilizer): ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (type == 1) {
                        Plant plant = new Plant(0, "", "", "", "", "");
                        plant.inputDetails();
                        itemList.addItem(plant);
                    } else if (type == 2) {
                        Tool tool = new Tool(0, "", "", "", "");
                        tool.inputDetails();
                        itemList.addItem(tool);
                    } else if (type == 3) {
                        Fertilizer fertilizer = new Fertilizer(0, "", "", "", "");
                        fertilizer.inputDetails();
                        itemList.addItem(fertilizer);
                    }
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    Item item = itemList.findItemByName(name);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter item type (Plant/Tool/Fertilizer): ");
                    String itemType = scanner.nextLine();
                    itemList.displayItemsByType(itemType);
                    break;
                case 5:
                    System.out.print("Enter index of item to update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter new item details:");
                    System.out.println("Enter item type (1. Plant, 2. Tool, 3. Fertilizer): ");
                    int typeToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (typeToUpdate == 1) {
                        Plant plant = new Plant(0, "", "", "", "", "");
                        plant.inputDetails();
                        itemList.updateItem(indexToUpdate, plant);
                    } else if (typeToUpdate == 2) {
                        Tool tool = new Tool(0, "", "", "", "");
                        tool.inputDetails();
                        itemList.updateItem(indexToUpdate, tool);
                    } else if (typeToUpdate == 3) {
                        Fertilizer fertilizer = new Fertilizer(0, "", "", "", "");
                        fertilizer.inputDetails();
                        itemList.updateItem(indexToUpdate, fertilizer);
                    }
                    break;
                case 6:
                    System.out.print("Enter index of item to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    itemList.removeItem(indexToRemove);
                    break;
                case 7:
                    itemList.sortItemsByPrice();
                    System.out.println("Items sorted by price.");
                    break;
                case 0:
                    System.out.println("Exiting.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
