/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.Scanner;

public class Tool extends Item {
    private String brand;
    private String warrantyPeriod;

    public Tool(double price, String name, String type, String brand, String warrantyPeriod) {
        super(price, name, type);
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void inputDetails() {
        super.inputDetails();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the brand: ");
        setBrand(scanner.nextLine());

        System.out.print("Enter the warranty period: ");
        setWarrantyPeriod(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Warranty: " + warrantyPeriod;
    }
}
