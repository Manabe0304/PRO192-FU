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
    private double productPrice;

    // Constructor
    public Product(int productId, String productName, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Getter for productId
    public int getProductId() {
        return productId;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Getter for productPrice
    public double getProductPrice() {
        return productPrice;
    }

    // Override toString method to return product details
    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Price: $" + productPrice;
    }
}
