/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Bracelet extends Jewelry {
    private String length;
    private String style;

    public Bracelet(double price, String material, String design, String length, String style) {
        super(price, material, design);
        this.length = length;
        this.style = style;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length: ");
        this.length = scanner.nextLine();

        System.out.print("Enter the style: ");
        this.style = scanner.nextLine();
    }

    @Override
    public String toString() {
        return "Bracelet - " + super.toString() + ", Length: " + length + ", Style: " + style;
    }
}
