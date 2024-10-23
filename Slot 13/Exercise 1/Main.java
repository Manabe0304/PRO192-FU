
import java.util.Scanner;

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
        JewelryList itemList = new JewelryList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all items");
            System.out.println("2. Add item");
            System.out.println("3. Find item by material");
            System.out.println("4. Find item by design");
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
                        Ring ring = new Ring(0, "", "", "", "");
                        ring.inputDetails();
                        itemList.addItem(ring);
                    } else if (type == 2) {
                        Necklace necklace = new Necklace(0, "", "", "", "");
                        necklace.inputDetails();
                        itemList.addItem(necklace);
                    } else if (type == 3) {
                        Bracelet bracelet = new Bracelet(0, "", "", "", "");
                        bracelet.inputDetails();
                        itemList.addItem(bracelet);
                    }
                    break;
                case 3:
                    System.out.print("Enter item material: ");
                    String material = scanner.nextLine();
                    Jewelry item = itemList.findItemByMaterial(material);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter item design (Ring/Necklace/Bracelet): ");
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
                        Ring ring = new Ring(0, "", "", "", "");
                        ring.inputDetails();
                        itemList.updateItem(indexToUpdate, ring);
                    } else if (typeToUpdate == 2) {
                        Necklace necklace = new Necklace(0, "", "", "", "");
                        necklace.inputDetails();
                        itemList.updateItem(indexToUpdate, necklace);
                    } else if (typeToUpdate == 3) {
                        Bracelet bracelet = new Bracelet(0, "", "", "", "");
                        bracelet.inputDetails();
                        itemList.updateItem(indexToUpdate, bracelet);
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
