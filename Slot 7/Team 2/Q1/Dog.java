/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Dog extends Animal {
    // Add attribute for breed
    private String breed;

    // Constructor to initialize all attributes
    public Dog(String name, int age, String breed) {
        // Constructor body
        super(name, age);
        this.breed = breed;
    }

    // Override the method to make dog-specific sound
    @Override
    public void makeSound() {
        // Method to be completed
        System.out.println("Animal: " + getName() + ", Age: " + getAge() + ", " + breed + ", is barking!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
