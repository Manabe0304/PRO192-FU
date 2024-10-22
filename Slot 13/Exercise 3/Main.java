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
        MediaList mediaList = new MediaList();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display all items");
            System.out.println("2. Add item");
            System.out.println("3. Find item by title");
            System.out.println("4. Find item by genre");
            System.out.println("5. Update item");
            System.out.println("6. Remove item");
            System.out.println("7. Sort items by release date");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    mediaList.displayAll();
                    break;
                case 2:
                    System.out.println("Enter item type (1. DVD, 2. Blu-ray, 3. DigitalCopy): ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (type == 1) {
                        DVD dvd = new DVD(0, "", "", "", "", 0);
                        dvd.inputDetails();
                        mediaList.addItem(dvd);
                    } else if (type == 2) {
                        BluRay bluRay = new BluRay(0, "", "", "", "", 0, "");
                        bluRay.inputDetails();
                        mediaList.addItem(bluRay);
                    } else if (type == 3) {
                        DigitalCopy digitalCopy = new DigitalCopy(0, "", "", "", "", 0, 0);
                        digitalCopy.inputDetails();
                        mediaList.addItem(digitalCopy);
                    }
                    break;
                case 3:
                    System.out.print("Enter item title: ");
                    String title = scanner.nextLine();
                    Media item = mediaList.findItemByTitle(title);
                    if (item != null) {
                        System.out.println(item);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter item genre: ");
                    String genre = scanner.nextLine();
                    Media items = mediaList.findItemByGenre(genre);
                    if (items != null) {
                        System.out.println(items);
                    } else {
                        System.out.println("Item not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter index of item to update: ");
                    int indexToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter new item details:");
                    // Assuming that input logic is the same as adding items
                    System.out.println("Enter item type (1. DVD, 2. Blu-ray, 3. DigitalCopy): ");
                    int typeToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (typeToUpdate == 1) {
                        DVD dvd = new DVD(0, "", "", "", "", 0);
                        dvd.inputDetails();
                        mediaList.updateItem(indexToUpdate, dvd);
                    } else if (typeToUpdate == 2) {
                        BluRay bluRay = new BluRay(0, "", "", "", "", 0, "");
                        bluRay.inputDetails();
                        mediaList.updateItem(indexToUpdate, bluRay);
                    } else if (typeToUpdate == 3) {
                        DigitalCopy digitalCopy = new DigitalCopy(0, "", "", "", "", 0, 0);
                        digitalCopy.inputDetails();
                        mediaList.updateItem(indexToUpdate, digitalCopy);
                    }
                    break;
                case 6:
                    System.out.print("Enter index of item to remove: ");
                    int indexToRemove = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    mediaList.removeItem(indexToRemove);
                    break;
                case 7:
                    mediaList.sortItemsByReleaseDate();
                    System.out.println("Items sorted by release date.");
                    mediaList.displayAll();
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
