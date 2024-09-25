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
        // Create a Person object
        Person person = new Person("Alice", 30);
        
        // Create a Professor object
        Professor professor = new Professor("Dr. Smith", 45, "Computer Science");
        
        // Display information of the person
        person.displayInfo();
        
        // Display information of the professor
        professor.displayInfo();
    }
}
