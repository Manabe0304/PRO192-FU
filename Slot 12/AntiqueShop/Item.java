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

public class Item {
    // Declare fields
    protected int value;  // the price of a Item (>=0)
    protected String creator;  // the creator who creates the item (is not empty)

    // Default constructor
    public Item() {
        value = 0;
        creator = "";
    }

    // Parameterized constructor
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    // Getters
    public int getValue() {
        return value;
    }

    public String getCreator() {
        return creator;
    }

    // Setters
    public void setValue(int value) {
        if (value >= 0) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Value must be non-negative.");
        }
    }

    public void setCreator(String creator) {
        if (creator != null && !creator.isEmpty()) {
            this.creator = creator;
        } else {
            throw new IllegalArgumentException("Creator cannot be empty.");
        }
    }

    // This method is used to input all fields of an Item object
    public void input() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the value of the item: ");
            int value = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter the creator of the item: ");
            String creator = scanner.nextLine();

            setValue(value);
            setCreator(creator);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // This method returns a string that includes value, creator of an Item object
    @Override
    public String toString() {
        return "Item [value=" + value + ", creator=" + creator + "]";
    }
}

