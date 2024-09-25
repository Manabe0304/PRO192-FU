/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        // Create an Animal object
        Animal animal = new Animal("Elephant", 10);
        
        // Create a Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        
        // Call makeSound method for the animal
        animal.makeSound();
        
        // Call makeSound method for the dog
        dog.makeSound();
    }
}
