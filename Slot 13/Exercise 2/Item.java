/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Item {
    private double price;
    private String name;
    private String type;

    public Item(double price, String name, String type) {
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Name cannot be empty.");
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (!type.isEmpty()) {
            this.type = type;
        } else {
            System.out.println("Type cannot be empty.");
        }
    }

    public void inputDetails() {
      // Implementation of inputDetails() method
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the type: ");
        String type = scanner.nextLine();

        System.out.print("Enter the price: ");
        double price = scanner.nextDouble();
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", Type: " + type + ", Price: $" + price;
    }
}
