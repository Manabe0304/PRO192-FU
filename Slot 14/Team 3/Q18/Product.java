/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Product {
    // Fields
    private int productId;
    private String productName;
    public int stockLevel; // This can be public or you can provide a setter method for stock updates

    // Constructor
    public Product(int productId, String productName, int stockLevel) {
        this.productId = productId;
        this.productName = productName;
        this.stockLevel = stockLevel;
    }

    // Getter for productId
    public int getProductId() {
        return productId;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Getter for stockLevel
    public int getStockLevel() {
        return stockLevel;
    }

    // toString method to print product details
    @Override
    public String toString() {
        return "Product Name: " + productName + ", Stock Level: " + stockLevel;
    }
}
