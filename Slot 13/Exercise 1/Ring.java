/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Ring extends Jewelry {
    private String size;
    private String stone;

    public Ring(double price, String material, String design, String size, String stone) {
        super(price, material, design);
        this.size = size;
        this.stone = stone;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getStone() {
        return stone;
    }

    public void setStone(String stone) {
        this.stone = stone;
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size: ");
        this.size = scanner.nextLine();

        System.out.print("Enter the stone: ");
        this.stone = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Ring - " + super.toString() + ", Size: " + size + ", Stone: " + stone;
    }
}
