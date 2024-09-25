/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Guitar extends Instrument {
    // Attribute for number of strings
    private int numberOfStrings;

    // Constructor to initialize all attributes, including those of the superclass
    public Guitar(String name, String type, int numberOfStrings) {
        super(name, type); // Call the Instrument class constructor
        this.numberOfStrings = numberOfStrings;
    }

    // Override the play method to play a guitar-specific sound
    @Override
    public void play() {
        System.out.println(getName() + " (" + getType() + "} with " + numberOfStrings + " strings is being strummed!");
    }

    // Getter for numberOfStrings (optional)
    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    
}
