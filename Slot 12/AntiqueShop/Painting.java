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

public class Painting extends Item {
    private int height;  // the height of a painting object (height>=0 and <=2000)
    private int width;  // the width of a painting object (width>=0 and <=3000)
    private boolean isWatercolour;  // the painting object uses a watercolor or not
    private boolean isFramed;  // the painting object has a frame or not

    // Default constructor
    public Painting() {
        super();
        this.height = 0;
        this.width = 0;
        this.isWatercolour = false;
        this.isFramed = false;
    }

    // Parameterized constructor
    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    // Getter methods
    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    // Setter methods
    public void setHeight(int height) {
        if (height >= 0 && height <= 2000) {
            this.height = height;
        } else {
            throw new IllegalArgumentException("Height must be between 0 and 2000.");
        }
    }

    public void setWidth(int width) {
        if (width >= 0 && width <= 3000) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("Width must be between 0 and 3000.");
        }
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    // This method is used to input all fields of a Painting object
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the height of the painting: ");
            int height = scanner.nextInt();
            System.out.print("Enter the width of the painting: ");
            int width = scanner.nextInt();
            System.out.print("Is the painting a watercolour? (true/false): ");
            boolean isWatercolour = scanner.nextBoolean();
            System.out.print("Is the painting framed? (true/false): ");
            boolean isFramed = scanner.nextBoolean();

            setHeight(height);
            setWidth(width);
            setWatercolour(isWatercolour);
            setFramed(isFramed);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // This method returns a string that includes all fields of a painting object
    @Override
    public String toString() {
        return "Painting [value=" + value + ", creator=" + creator + ", height=" + height + ", width=" + width 
                + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + "]";
    }
}

