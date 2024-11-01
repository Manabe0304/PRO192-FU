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

public class Statue extends Item {
    private int weight;  // the weight of a statue object (weight>=0 and <=1000)
    private String colour;  // the colour of a statue object (is not empty)

    // Default constructor
    public Statue() {
        super();
        this.weight = 0;
        this.colour = "";
    }

    // Parameterized constructor
    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    // Getter methods
    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    // Setter methods
    public void setWeight(int weight) {
        if (weight >= 0 && weight <= 1000) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight must be between 0 and 1000.");
        }
    }

    public void setColour(String colour) {
        if (colour != null && !colour.isEmpty()) {
            this.colour = colour;
        } else {
            throw new IllegalArgumentException("Colour cannot be empty.");
        }
    }

    // This method is used to input all fields of a Statue object
    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the weight of the statue: ");
            int weight = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            System.out.print("Enter the colour of the statue: ");
            String colour = scanner.nextLine();

            setWeight(weight);
            setColour(colour);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // This method returns a string that includes value, creator, weight, and colour of a statue object
    @Override
    public String toString() {
        return "Statue [value=" + value + ", creator=" + creator + ", weight=" + weight + ", colour=" + colour + "]";
    }

}

