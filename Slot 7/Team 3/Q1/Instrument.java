/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Instrument {
    // Attributes for name and type
    private String name;
    private String type;

    // Constructor to initialize the attributes
    public Instrument(String name, String type) {
        this.name = name;
        this.type = type;
    }

    // Method to play the instrument (generic version)
    public void play() {
        System.out.println(name + " (" + type + ") is being played.");
    }

    // Getters (optional, if needed later)
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
