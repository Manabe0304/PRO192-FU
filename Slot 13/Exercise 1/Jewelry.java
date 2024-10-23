
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

public class Jewelry {
    private double price;
    private String material;
    private String design;

    public Jewelry (double price, String material, String design) {
        this.price = price;
        this.material = material;
        this.design = design;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        if (!material.isEmpty()) {
            this.material = material;
        } else {
            System.out.println("Material cannot be empty.");
        }
    }

    public String getDesign() {
        return design;
    }

    public void setDesign (String design) {
        if (!design.isEmpty()) {
            this.design = design;
        }
    }

    public void inputDetails() {
      // Implementation of inputDetails() method
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the material: ");
        setMaterial(scanner.nextLine());

        System.out.print("Enter the design: ");
        setDesign(scanner.nextLine());

        System.out.print("Enter the price: ");
        setPrice(scanner.nextDouble());
    }
    
    @Override
    public String toString() {
        return "Material: " + material + ", Design: " + design + ", Price: $" + price;
    }
}
