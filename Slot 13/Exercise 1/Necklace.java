/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Necklace extends Jewelry {
    private String length;
    private String claspType;

    public Necklace(double price, String material, String design, String length, String claspType) {
        super(price, material, design);
        this.length = length;
        this.claspType = claspType;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getClaspType() {
        return claspType;
    }

    public void setClaspType(String claspType) {
        this.claspType = claspType;
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        this.length = scanner.nextLine();

        System.out.print("Enter the clasp type: ");
        this.claspType = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Necklace - " + super.toString() + ", Length: " + length + ", Clasp Type: " + claspType;
    }
}
