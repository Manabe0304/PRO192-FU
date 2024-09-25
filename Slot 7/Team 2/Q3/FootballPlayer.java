/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class FootballPlayer extends Player {
    // Attribute for position
    private String position;

    // Constructor to initialize all attributes, including those of the superclass
    public FootballPlayer(String name, int age, String position) {
        super(name, age); // Call the Player class constructor
        this.position = position;
    }

    // Override the method to display football player information
    @Override
    public void displayPlayerInfo() {
        System.out.println("Football Player Name: " + getName() + " | Age: " + getAge() + " | Position: " + position);
    }

    // Getter for position (optional)
    public String getPosition() {
        return position;
    }
}
