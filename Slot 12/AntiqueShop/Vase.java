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

public class Vase extends Item {
    private int height;  // height of a vase (>=0 and <=2000)
    private String material;  // material of a vase (is not empty)

    // Default constructor
    public Vase() {
        super();
        this.height = 0;
        this.material = "";
    }

    // Parameterized constructor
    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    // Getter methods
    public int getHeight() {
        return height;
    }

    public String getMaterial() {
        return material;
    }

    // Setter methods
    public void setHeight(int height) {
        if (height >= 0 && height <= 2000) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be between 0 and 2000.");
        }
    }

    public void setMaterial(String material) {
        if (material != null && !material.isEmpty()) {
            this.material = material;
        } else {
            throw new IllegalArgumentException("Material cannot be empty.");
        }
    }

    // This method is used to input all fields of a Vase object
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the height of the vase: ");
            int height = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter the material of the vase: ");
            String material = scanner.nextLine();

            setHeight(height);
            setMaterial(material);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // This method returns a string that includes value, creator, height, and material of a vase object
    @Override
    public String toString() {
        return "Vase [value=" + value + ", creator=" + creator + ", height=" + height + ", material=" + material + "]";
    }

}
