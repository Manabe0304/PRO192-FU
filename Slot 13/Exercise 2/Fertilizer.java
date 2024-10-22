/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Fertilizer extends Item {
    private String nutrientContent;
    private String applicationMethod;

    public Fertilizer(double price, String name, String type, String nutrientContent, String applicationMethod) {
        super(price, name, type);
        this.nutrientContent = nutrientContent;
        this.applicationMethod = applicationMethod;
    }

    public String getNutrientContent() {
        return nutrientContent;
    }

    public void setNutrientContent(String nutrientContent) {
        this.nutrientContent = nutrientContent;
    }

    public String getApplicationMethod() {
        return applicationMethod;
    }

    public void setApplicationMethod(String applicationMethod) {
        this.applicationMethod = applicationMethod;
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the nutrient content: ");
        setNutrientContent(scanner.nextLine());

        System.out.print("Enter the application method: ");
        setApplicationMethod(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", Nutrient Content: " + nutrientContent + ", Application Method: " + applicationMethod;
    }
}
