/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Team2;

/**
 *
 * @author Asus
 */
import java.time.LocalDate;

public class Product {
    private String productName;
    private String category;
    private double price;
    private LocalDate manufactureDate;

    public Product(String productName, String category, double price, LocalDate manufactureDate) {
        this.productName = productName;
        this.category = category;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0) {
            this.price = this.price * (1 - percentage / 100);
        }
    }

    public String getDetails() {
        return "Product: " + productName + ", Category: " + category + ", Price: $" + price +
               ", Manufacture Date: " + manufactureDate;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public static void main(String[] args) {
        LocalDate manufactureDate = LocalDate.of(2023, 4, 15);
        Product product = new Product("Laptop", "Electronics", 1000.0, manufactureDate);

        System.out.println(product.getDetails());
        
        product.applyDiscount(10);
        System.out.println(product.getDetails());

        product.applyDiscount(-5);
    }
}
