/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Plant extends Item {
    private String species;
    private String sunlightRequirement;
    private String wateringFrequency;

    public Plant(double price, String name, String type, String species, String sunlightRequirement, String wateringFrequency) {
        super(price, name, type);
        this.species = species;
        this.sunlightRequirement = sunlightRequirement;
        this.wateringFrequency = wateringFrequency;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSunlightRequirement() {
        return sunlightRequirement;
    }

    public void setSunlightRequirement(String sunlightRequirement) {
        this.sunlightRequirement = sunlightRequirement;
    }

    public String getWateringFrequency() {
        return wateringFrequency;
    }

    public void setWateringFrequency(String wateringFrequency) {
        this.wateringFrequency = wateringFrequency;
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the species: ");
        setSpecies(scanner.nextLine());

        System.out.print("Enter the sunlight requirement: ");
        setSunlightRequirement(scanner.nextLine());

        System.out.print("Enter the watering frequency: ");
        setWateringFrequency(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species + ", Sunlight: " + sunlightRequirement + ", Watering: " + wateringFrequency;
    }
}
